package com.laugues.example.jar1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationUtilsTest {

    @Test
    public void add0() {
        assertEquals(0, OperationUtils.add(0, 0));
    }

    @Test
    public void add() {
        assertEquals(100, OperationUtils.add(100, 0));
    }
}