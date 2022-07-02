package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void amount() {
        float expected = 4;
        float actual = new Calculator().amount(1, 3);
        assertEquals(expected, actual);
    }

    @Test
    void multiplication() {
    }

    @Test
    void division() {
    }

    @Test
    void difference() {
    }
}