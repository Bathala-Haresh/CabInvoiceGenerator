package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InvoiceServicesTest {
    InvoiceGenerator invoiceGenerator = null;
    /**
     * Purpose : To create object before any test case is called so that it improves Redundancy of code
     */
    @Before
    public void setUp() {
        invoiceGenerator = new InvoiceGenerator();
    }
    /**
     * Step 1
     * Purpose : Given distance and time,
     *           return total fare
     */
    @Test
    public void givenDistanceAndMinute_shouldReturn_totalFare() {

        double distance = 20.0;
        int minute = 15;
        double fare = invoiceGenerator.calculateFare(distance, minute);
        assertEquals(215, fare, 0.0);
    }
    /**
     * Step 2
     * Purpose: Given distance and time,
     *          return minimum fare as 5
     */
    @Test
    public void givenDistanceAndMinute_shouldReturn_minFare() {
        double distance = 0.3;
        int minute = 2;
        double fare = invoiceGenerator.calculateFare(distance, minute);
        assertEquals(5, fare, 0.0);
    }
}