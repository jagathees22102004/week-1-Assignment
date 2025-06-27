package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up Calculator...");
    }

    @After
    public void tearDown() {
        calculator.reset();
        System.out.println("Tearing down Calculator...");
    }

    @Test
    public void testAddition() {
        int result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(20, 6);
        assertEquals(14, result);
    }
}
