package com.bridgelabz;

public class InvoiceGenerator {

    private static final int costPerMinute =1;
    private static final double minCostPerKm =10;
    private static final double minfare = 5;

    /**
     * Purpose : Given distance and time,Return total fare for the journey
     *
     * Condition : If minimum total fare is less than the MINIMUM_FARE, return MINIMUM_FARE
     *
     * @param distance
     * @param minute
     */
    public double calculateFare(double distance, int minute) {
        double totalfare = (distance * minCostPerKm) + (minute * costPerMinute);
        if(distance < 1.0 && minute <= 5) {
            return totalfare;
        }else if(distance < 0.5 && minute <= 2) {
            return minfare;
        }
        return totalfare;
    }

}