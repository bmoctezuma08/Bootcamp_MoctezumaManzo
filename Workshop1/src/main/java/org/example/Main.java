package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your loan principal: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter your annual interest rate as a percent: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter the length of your loan in years: ");
        int loanLength = scanner.nextInt();

        double monthlyRate = (annualRate / 12) / 100;
        double numPayments = loanLength * 12.0;

        double monthlyPayment = (principal * (monthlyRate * Math.pow(1 + monthlyRate, numPayments))) / (Math.pow((1 + monthlyRate), numPayments) - 1);

        double totalInterest = (monthlyPayment * numPayments) - principal;

        System.out.printf("Your monthly payment: $%.2f%n", monthlyPayment);

        System.out.printf("Total interest paid: $%.2f%n", totalInterest);

        scanner.close();
    }
}