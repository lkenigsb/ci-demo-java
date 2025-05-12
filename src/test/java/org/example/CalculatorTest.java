package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest
{
    @Test
    public void testAddNumbers()
    {
        // arrange
        final Calculator calculator = new Calculator();

        // act
        final double sum = calculator.add(4, 3);

        // assert
        assertEquals(20, sum);
    }

    @Test
    public void testSubtractNumbers()
    {
        // arrange
        final Calculator calculator = new Calculator();

        // act
        final double subtracted = calculator.subtract(10, 3);

        // assert
        assertEquals(7, subtracted);
    }
}
