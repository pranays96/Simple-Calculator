package org.example;

public class Main {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        // Test All cases-
        int result1 = calculator.add("");           // Empty string
        int result2 = calculator.add("1");          // Single number

        // Printing the results
        System.out.println("Result 1: " + result1); // Expected output: 0
        System.out.println("Result 2: " + result2); // Expected output: 1
    }
}