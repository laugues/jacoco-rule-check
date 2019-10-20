package com.laugues.example.jar2;

public final class HelloWorldUtils {

    private HelloWorldUtils() {

    }

    public static String helloWorld() {
        return "Hello World";
    }

    public static String helloWorld(String origin) {
        return "Hello World from " + origin;
    }
}
