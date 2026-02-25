package me.tud.mc2d.generators.instruction;

import com.fasterxml.jackson.databind.JsonNode;
import me.tud.mc2d.generators.instruction.exception.InstructionException;

import java.util.ArrayDeque;
import java.util.Deque;

public final class InstructionContext {

    public static final int MAX_STRING_REPRESENTATION_LENGTH = 200;

    private final Deque<String> path = new ArrayDeque<>();
    private final Deque<String> context = new ArrayDeque<>();

    public void pushKey(String key) {
        path.addLast(escape(key));
    }

    public void pushIndex(int i) {
        path.addLast(String.valueOf(i));
    }

    public void pop() {
        path.removeLast();
    }

    public void pushCtx(String c) {
        context.addLast(c);
    }

    public void popCtx() {
        context.removeLast();
    }

    public String pointer() {
        return "/" + String.join("/", path);
    }

    public String contextString() {
        return String.join(" > ", context);
    }

    public String describe(JsonNode node) {
        String string = node.toString();
        if (string.length() > MAX_STRING_REPRESENTATION_LENGTH)
            string = string.substring(0, MAX_STRING_REPRESENTATION_LENGTH - 3) + "...";
        return node.getNodeType() + "[" + string + "]";
    }

    public InstructionException exception(String message) {
        return new InstructionException(pointer(), contextString(), message);
    }

    public InstructionException expected(String expected, JsonNode actual) {
        return expected(expected, describe(actual));
    }

    public InstructionException expected(String expected, String actual) {
        return new InstructionException(pointer(), contextString(), "Expected " + expected + ", got " + actual);
    }

    private static String escape(String s) {
        return s.replace("~","~0").replace("/","~1"); // JSON Pointer escaping
    }

}
