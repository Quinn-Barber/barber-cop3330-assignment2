package org.example.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator test = new PaymentCalculator();
        double i, b, p;
        i = 12.0/36500.0;
        b = 5000.0;
        p = 100.0;
        int output = test.calculateMonthsUntilPaidOff(i, b, p);
        assertEquals(70, output);
    }
}