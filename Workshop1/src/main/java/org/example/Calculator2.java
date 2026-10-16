package org.example;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your deposit: ");
        double deposit = scanner.nextDouble();

        System.out.println("Enter your interest rate as a percent: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();

        int timesCompounded = 365;

        double futureValue = deposit * Math.pow((1 + (annualRate / 100) / timesCompounded), timesCompounded * years);

        double totalInterest = futureValue - deposit;

        System.out.printf("The ending value of your account is: $%.2f%n", futureValue);

        System.out.printf("You earned $%.2f in interest %n", totalInterest);

        scanner.close();
    }
}
