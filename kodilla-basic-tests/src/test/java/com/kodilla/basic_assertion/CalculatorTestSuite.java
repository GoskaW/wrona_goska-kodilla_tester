package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        Calculator calculator2 = new Calculator();
        int a2 = 25;
        int b2 = 7;
        int subResult = calculator2.subtract(a2, b2);
        assertEquals(18, subResult);
    }

    @Test
    public void testPower() {
        Calculator calculator3 = new Calculator();
        double a3 = 4;
        double b3 = 2;
        double power = Math.pow(a3, b3);
        assertEquals(16, power);
    }

    @Test
    public void testPower2() {
        Calculator calculator4 = new Calculator();
        double a4 = 0;
        double b4 = 2;
        double power2 = Math.pow(a4, b4);
        assertEquals(0, power2, 1);
    }

    @Test
    public void testPower3() {
        Calculator calculator5 = new Calculator();
        double a5 = -1;
        double b5 = 2;
        double power3 = Math.pow(a5, b5);
        assertEquals(-1, power3, 3);
    }
}
