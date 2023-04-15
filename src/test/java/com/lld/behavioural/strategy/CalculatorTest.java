package com.lld.behavioural.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testStrategies() {
        int a = 10;
        int b = 20;

        calculator.setStrategy(new AdditionStrategy());

        int sum = calculator.performCalculation(a, b);
        assertEquals(a + b, sum);

        calculator.setStrategy(new SubtractionStrategy());

        int diff = calculator.performCalculation(a, b);
        assertEquals(a - b, diff);

    }
}