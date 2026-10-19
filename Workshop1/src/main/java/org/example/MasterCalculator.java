package org.example;

import java.util.Scanner;

public class MasterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Financial Calculator :D");
        int choice;

        do {
            System.out.println("1. Mortgage Calculator");
            System.out.println("2. Future Value Calculator (Compound Interest)");
            System.out.println("3. Present Value of Annuity Calculator");
            System.out.println("0. Exit");

            System.out.println("Please select a calculator (0-3)");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter loan principal: ");
                    double principal = scanner.nextDouble();

                    System.out.println("Enter interest rate as a percent: ");
                    double mortgageAnnualRate = scanner.nextDouble();

                    System.out.println("Enter loan length in years: ");
                    int loanLength = scanner.nextInt();

                    double monthlyRate = (mortgageAnnualRate / 12) / 100;
                    double numPayments = loanLength * 12.0;

                    double mortgageValueOne = monthlyRate * Math.pow((1 + monthlyRate), numPayments);
                    double mortgageValueTwo = Math.pow(1 + monthlyRate, numPayments) - 1;

                    double loanMonthlyPayments = principal * mortgageValueOne / mortgageValueTwo;

                    double totalInterest = (loanMonthlyPayments * numPayments) - principal;

                    System.out.printf("Your monthly payment: $%.2f%n", loanMonthlyPayments);

                    System.out.printf("Total interest paid: $%.2f%n", totalInterest);

                    System.out.println("-------");

                    System.out.println("0. Exit");
                    System.out.println("4. Return to main menu");
                    choice = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();

                    System.out.println("Enter interest rate as a percent: ");
                    double futureAnnualRate = scanner.nextDouble();

                    System.out.println("Enter number of years: ");
                    int futureYears = scanner.nextInt();

                    int timesCompounded = 365;

                    double futureValue = deposit * Math.pow((1 + (futureAnnualRate / 100) / timesCompounded), timesCompounded * futureYears);
                    double interestEarned = futureValue - deposit;

                    System.out.printf("The total value of your account is: $%.2f%n", futureValue);

                    System.out.printf("You earned $%.2f in interest. %n", interestEarned);

                    System.out.println("-------");

                    System.out.println("0. Exit");
                    System.out.println("4. Return to main menu");
                    choice = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Enter monthly payout: ");
                    double monthlyPayout = scanner.nextDouble();

                    System.out.println("Enter expected interest rate as a percent: ");
                    double annuityAnnualRate = scanner.nextDouble();

                    System.out.println("Enter years until payout: ");
                    int years = scanner.nextInt();

                    double annuityMonthlyRate = (annuityAnnualRate / 12) / 100;
                    int annuityMonthlyPayments = years * 12;

                    double annuityValueOne = 1 - Math.pow(1 + annuityMonthlyRate, -annuityMonthlyPayments);
                    double presentValue = monthlyPayout * (annuityValueOne / annuityMonthlyRate);

                    System.out.printf("The present value of your annuity is: $%.2f%n", presentValue);

                    System.out.println("-------");

                    System.out.println("0. Exit");
                    System.out.println("4. Return to main menu");
                    choice = scanner.nextInt();
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Selection unavailable. Please choose from the available options.");
            }
        } while(choice != 0);

        System.out.println("Thank you for visiting Financial Calculator! Please come again soon :)");

        scanner.close();
    }
}
