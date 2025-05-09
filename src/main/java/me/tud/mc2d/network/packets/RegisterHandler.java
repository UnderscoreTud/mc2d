package me.tud.mc2d.network.packets;

import me.tud.mc2d.network.ConnectionState;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RegisterHandler {

    ConnectionState value();

}
