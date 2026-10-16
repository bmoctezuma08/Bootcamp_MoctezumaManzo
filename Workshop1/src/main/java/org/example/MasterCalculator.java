package org.example;

import java.util.Scanner;

public class MasterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Financial Calculator Menu---");

        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Future Value Calculator (Compound Interest)");
        System.out.println("3. Present Value of Annuity Calculator");
        System.out.println("0. Exit");

        System.out.println("Please select a calculator (0-3)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("");
        }
    }
}
