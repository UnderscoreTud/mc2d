package me.tud.mc2d.network.exceptions;

import lombok.Getter;

import java.util.List;

public class BroadcastException extends Exception {

    private final @Getter List<Throwable> causes;

    public BroadcastException(List<Throwable> causes) {
        super("One or more failures occurred during broadcast.");
        this.causes = causes;
    }

    @Override
    public String getMessage() {
        StringBuilder message = new StringBuilder(super.getMessage()).append("\n");
        for (Throwable cause : causes)
            message.append(" - ").append(cause.getMessage()).append("\n");
        return message.toString();
    }

}
