package com.laugues.example.jar2;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldUtilsTest {

    @Test
    public void helloWorld() {
        assertEquals("Hello World", HelloWorldUtils.helloWorld());
    }

    @Test
    public void testHelloWorld() {
        assertEquals("Hello World from France", HelloWorldUtils.helloWorld("France"));

    }
}