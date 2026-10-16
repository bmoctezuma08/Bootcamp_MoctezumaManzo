package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter monthly payout: ");
        double monthlyPayout = scanner.nextDouble();

        System.out.println("Enter expected interest rate as a percent: ");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter how years of payout: ");
        int years = scanner.nextInt();

        
    }
}
