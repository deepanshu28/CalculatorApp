package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Automated tests for the Calculator class using JUnit 5.
 */
public class CalculatorTest {
    
    private Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        // Test case: 5 + 3 should equal 8
        assertEquals(8, calculator.add(5, 3), "Addition failed: 5 + 3 should be 8.");
    }

    @Test
    void testSubtraction() {
        // Test case: 10 - 4 should equal 6
        assertEquals(6, calculator.subtract(10, 4), "Subtraction failed: 10 - 4 should be 6.");
    }

    @Test
    void testMultiplication() {
        // Test case: 2 * 7 should equal 14
        assertEquals(14, calculator.multiply(2, 7), "Multiplication failed: 2 * 7 should be 14.");
    }
}