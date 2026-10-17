package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter monthly payout: ");
        double monthlyPayout = scanner.nextDouble();

        System.out.println("Enter expected interest rate as a percent: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter years until payout: ");
        int years = scanner.nextInt();

        double monthlyRate = (annualRate / 12) / 100;
        int monthlyPayments = years * 12;

        double valueOne = (1 - Math.pow((1 + monthlyRate), -monthlyPayments));
        double presentValue = monthlyPayout * (valueOne / monthlyRate);

        System.out.printf("The present value of your annuity is $%.2f%n", presentValue);

        scanner.close();
    }
}
