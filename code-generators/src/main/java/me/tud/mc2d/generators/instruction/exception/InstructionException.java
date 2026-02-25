package me.tud.mc2d.generators.instruction.exception;

import lombok.Getter;

@Getter
public class InstructionException extends RuntimeException {
    
    private final String path;
    private final String context;
    private final String message;

    public InstructionException(String path, String context, String message) {
        super(format(path, context) + ": " + message);
        this.path = path;
        this.context = context;
        this.message = message;
    }

    public InstructionException(String path, String context, Throwable cause) {
        super(format(path, context), cause);
        this.path = path;
        this.context = context;
        this.message = null;
    }

    public InstructionException(String path, String context, String message, Throwable cause) {
        super(format(path, context) + ": " + message, cause);
        this.path = path;
        this.context = context;
        this.message = message;
    }

    private static String format(String path, String context) {
        return "Instruction error at " + path + " [" + context + "]";
    }

}
