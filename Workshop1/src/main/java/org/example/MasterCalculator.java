package org.example;

import java.util.Scanner;

public class MasterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Financial Calculator :D");

        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Future Value Calculator (Compound Interest)");
        System.out.println("3. Present Value of Annuity Calculator");
        System.out.println("0. Exit");

        System.out.println("Please select a calculator (0-3)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter your loan principal: ");
                double principal = scanner.nextDouble();

                System.out.println("Enter your interest rate as a decimal: ");
                double mortgageAnnualRate = scanner.nextDouble();

                System.out.println("Enter your loan length in years: ");
                int loanLength = scanner.nextInt();

                double monthlyRate = (mortgageAnnualRate / 12) / 100;
                double numPayments = loanLength * 12.0;

                double valueOne = monthlyRate * Math.pow((1 + monthlyRate), numPayments);
                double valueTwo = Math.pow(1 + monthlyRate, numPayments) - 1;

                double monthlyPayments = principal * valueOne / valueTwo;

                double totalInterest = (monthlyPayments * numPayments) - principal;

                System.out.printf("Your monthly payment: $%.2f%n", monthlyPayments);

                System.out.printf("Total interest paid: $%.2f%n", totalInterest);
                break;
            case 2:
                System.out.println("Enter your deposit: ");
                double deposit = scanner.nextDouble();

                System.out.println("Enter your interest rate as a percent: ");
                double futureAnnualRate = scanner.nextDouble();

                System.out.println("Enter number of years: ");
                int futureYears = scanner.nextInt();

                int daysInYear = 365;

                double dailyRate = futureAnnualRate / daysInYear;

                int totalNumDays = daysInYear * futureYears;

                double futureValue = deposit * Math.pow(1 + dailyRate, totalNumDays);

                double interestEarned = futureValue - deposit;

                System.out.printf("The total value of your account is: $%.2f%n", futureValue);

                System.out.printf("You earned $%.2f in interest. %n", interestEarned);
            case 3:
                System.out.println("Enter monthly payout: ");
                double monthlyPayout = scanner.nextDouble();

                System.out.println("Enter expected interest rate as a percent: ");
                double annuityAnnualRate = scanner.nextDouble();

                System.out.println("Enter years until payout: ");
                int years = scanner.nextInt();
        }
    }
}
