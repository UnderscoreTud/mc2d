package me.tud.mc2d.util;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.Immutable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.*;

/**
 * Represents an immutable, type-safe pipeline for processing data, composed of {@link DataHandler}.
 * <p>
 * A pipeline has a defined input type {@link I} and output type {@link O}.
 * <p>
 * Handlers are executed in the order they are added.
 *
 * @param <I> the input type of the entire pipeline
 * @param <O> the final output type of the entire pipeline
 */
@Immutable
public final class Pipeline<I, O> {

    private final @Unmodifiable List<DataHandler<?, ?>> handlers;

    private Pipeline(SequencedCollection<DataHandler<?, ?>> handlers) {
        this.handlers = Collections.unmodifiableList(new LinkedList<>(handlers));
    }

    /**
     * Creates a new builder to construct a pipeline.
     *
     * @param <F> the input type of the first handler (and the pipeline)
     * @return a new builder instance
     */
    public static <F> Builder<F, F> builder() {
        return builder(CommonHandlers.identity());
    }

    /**
     * Creates a new builder to construct a pipeline, starting with the first handler.
     *
     * @param handler the first data handler, which defines the initial input type
     * @return a new builder instance
     * @param <F> the input type of the first handler (and the pipeline)
     * @param <L> the output type of the first handler
     */
    public static <F, L> Builder<F, L> builder(DataHandler<F, L> handler) {
        return new Builder<>(handler);
    }

    /**
     * Composes compatible pipelines into a single pipeline.
     *
     * @return new, combined pipeline.
     */
    public static <A, B, C> Pipeline<A, C> compose(Pipeline<A, B> p1, Pipeline<B, C> p2) {
        return compose(List.of(p1, p2));
    }

    /**
     * Composes compatible pipelines into a single pipeline.
     *
     * @return new, combined pipeline.
     */
    public static <A, B, C, D> Pipeline<A, D> compose(Pipeline<A, B> p1, Pipeline<B, C> p2, Pipeline<C, D> p3) {
        return compose(List.of(p1, p2, p3));
    }

    /**
     * Composes compatible pipelines into a single pipeline.
     *
     * @return new, combined pipeline.
     */
    public static <A, B, C, D, E> Pipeline<A, E> compose(Pipeline<A, B> p1, Pipeline<B, C> p2,
                                                         Pipeline<C, D> p3, Pipeline<D, E> p4) {
        return compose(List.of(p1, p2, p3, p4));
    }

    /**
     * Composes compatible pipelines into a single pipeline.
     *
     * @return new, combined pipeline.
     */
    public static <A, B, C, D, E, F> Pipeline<A, F> compose(Pipeline<A, B> p1, Pipeline<B, C> p2, Pipeline<C, D> p3,
                                                            Pipeline<D, E> p4, Pipeline<E, F> p5) {
        return compose(List.of(p1, p2, p3, p4, p5));
    }

    private static <First, Last> Pipeline<First, Last> compose(List<Pipeline<?, ?>> pipelines) {
        List<DataHandler<?, ?>> combined = new LinkedList<>();
        pipelines.forEach(p -> combined.addAll(p.handlers));
        return new Pipeline<>(combined);
    }

    /**
     * Processes the given input through the entire pipeline, transforming it through each handler in order.
     *
     * @param input the initial data to process
     * @return the result
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public O process(I input) {
        Object currentData = input;
        for (DataHandler handler : handlers) currentData = handler.transform(currentData);
        return (O) currentData;
    }

    /**
     * A builder for creating {@link Pipeline} instances with compile-time type safety.
     *
     * @param <I> the input type of the pipeline being built
     * @param <Current> the output type of the last handler added to the builder
     */
    public static class Builder<I, Current> {

        protected final List<DataHandler<?, ?>> handlers = new LinkedList<>();

        private Builder(DataHandler<I, Current> firstHandler) {
            Preconditions.checkNotNull(firstHandler, "First handler cannot be null");
            handlers.add(firstHandler);
        }

        private Builder(List<DataHandler<?, ?>> handlers) {
            this.handlers.addAll(handlers);
        }

        /**
         * Adds a new {@link DataHandler} to the end of the pipeline.
         *
         * @param handler handler to add
         * @return this
         * @param <Next> next output type
         */
        @Contract("_ -> this")
        @SuppressWarnings("unchecked")
        public <Next> Builder<I, Next> next(DataHandler<Current, Next> handler) {
            Preconditions.checkNotNull(handler, "Next handler cannot be null");
            handlers.add(handler);
            return (Builder<I, Next>) this;
        }

        /**
         * Chains an existing Pipeline to the end of the current build sequence.
         * <p>
         * The pipeline's input type must match the output type of the previously added handler or pipeline.
         *
         * @param pipeline the pipeline to chain
         * @return this
         * @param <Next> next output type
         */
        @Contract("_ -> this")
        @SuppressWarnings("unchecked")
        public <Next> Builder<I, Next> next(Pipeline<Current, Next> pipeline) {
            Preconditions.checkNotNull(pipeline, "Pipeline to be chained cannot be null");
            handlers.addAll(pipeline.handlers);
            return (Builder<I, Next>) this;
        }

        /**
         * Constructs new protected builder that allows additional operations
         * on the incoming items.
         *
         * @return protected builder
         */
        public ProtectedBuilder<I, Current> protect() {
            ProtectedBuilder<I, Current> protectedBuilder = new ProtectedBuilder<>(handlers);
            protectedBuilder.handlers.add(CommonHandlers.protect());
            return protectedBuilder;
        }

        /**
         * Builds the immutable {@link Pipeline}.
         */
        public Pipeline<I, Current> build() {
            return new Pipeline<>(handlers);
        }

    }

    /**
     * A builder that added {@link CommonHandlers#protect()} into its pipeline, allowing
     * application of additional operations on the items.
     *
     * @param <I> the input type of the pipeline being built
     * @param <Current> the output type of the last handler added to the builder
     */
    public static class ProtectedBuilder<I, Current> extends Builder<I, Current> {

        private ProtectedBuilder(List<DataHandler<?, ?>> handlers) {
            super(handlers);
        }

        @Override
        @SuppressWarnings("unchecked")
        public <Next> ProtectedBuilder<I, Next> next(DataHandler<Current, Next> handler) {
            handlers.add(CommonHandlers.map(handler));
            return (ProtectedBuilder<I, Next>) this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <Next> ProtectedBuilder<I, Next> next(Pipeline<Current, Next> pipeline) {
            handlers.addAll(pipeline.handlers.stream().map(CommonHandlers::map).toList());
            return (ProtectedBuilder<I, Next>) this;
        }

        @Override
        public ProtectedBuilder<I, Current> protect() {
            return this;
        }

        @Override
        public Pipeline<I, @Nullable Current> build() {
            handlers.add(CommonHandlers.elseNull());
            return new Pipeline<>(this.handlers);
        }

        /**
         * Applies mapping function on the incoming data.
         *
         * @param mapper mapping function
         * @return this
         * @param <Next> next output type
         */
        @SuppressWarnings("unchecked")
        public <Next> ProtectedBuilder<I, Next> map(Function<@NotNull Current, @NotNull Next> mapper) {
            handlers.add(CommonHandlers.map(mapper));
            return (ProtectedBuilder<I, Next>) this;
        }

        /**
         * Applies filter function on the incoming data.
         *
         * @param filter filter function
         * @return this
         */
        public ProtectedBuilder<I, Current> filter(Predicate<@NotNull Current> filter) {
            handlers.add(CommonHandlers.filter(filter));
            return this;
        }

        /**
         * Applies or function on the incoming data.
         *
         * @param supplier supplier
         * @return this
         */
        public ProtectedBuilder<I, Current> or(Supplier<@NotNull Current> supplier) {
            handlers.add(CommonHandlers.or(supplier));
            return this;
        }

        /**
         * Builds the immutable {@link Pipeline}.
         */
        public Pipeline<I, Optional<Current>> buildOpt() {
            return new Pipeline<>(this.handlers);
        }

    }

}
