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

        double monthlyPayment = principal * (annualRate * Math.pow(1 + annualRate, numPayments)) / Math.pow((1 + annualRate), numPayments) - 1;

        double totalInterest = (monthlyPayment * numPayments) - principal;
    }
}