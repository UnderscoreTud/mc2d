package me.tud.mc2d.util;

/**
 * Represents a single processing step within a {@link Pipeline}.
 * <p>
 * {@link DataHandler} is responsible for transforming an input data type {@link I} (from) into an output data type
 * {@link O} (to).
 * <p>
 * Each handler performs a specific operation, such as encoding, decoding, compression, or data validation.
 *
 * @param <I> input data type this handler accepts
 * @param <O> output data type this handler produces
 */
@FunctionalInterface
public interface DataHandler<I, O> {

    /**
     * Processes the given instance of type {@link I} and transforms it into an instance of type {@link O}.
     *
     * @param instance input data
     * @return transformed data
     */
    O transform(I instance);

}
