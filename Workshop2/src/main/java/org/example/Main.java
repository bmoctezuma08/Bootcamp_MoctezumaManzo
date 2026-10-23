package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Book[] bookArray = new Book[20];

        bookArray[0] = new Book(1, "9780735219113" , "Where the Crawdads Sing", false, "");
        bookArray[1] = new Book(2, "9780593192108", "Set Boundaries, Find Peace: A Guide to Reclaiming Yourself", true, "Nedra Glover Tawwab");
        bookArray[2] = new Book(3, "9780593422946", "The Heaven & Earth Grocery Store", false, "");
        bookArray[3] = new Book(4, "9780689870477", "Here Be Monsters!", true, "Alan Snow");
        bookArray[4] = new Book(5, "9780593468463", "Never Whistle at Night", false, "");
        bookArray[5] = new Book(6, "9780688168445", "All About Love: New Visions", true, "bell hooks");
        bookArray[6] = new Book(7, "9781454952466", "The Puerto Rican War: A Graphic History", false, "");
        bookArray[7] = new Book(8, "9781888963571", "Bone: The Complete Cartoon Epic in One Volume", true, "Jeff Smith");
        bookArray[8] = new Book(9, "9780141990675", "The New Jim Crow: Mass Incarceration in the Age of Colorblindness", false, "");
        bookArray[9] = new Book(10, "9780853459910", "Open Veins of Latin America: Five Centuries of the Pillage of a Continent", true, "Eduardo Galeano");
        bookArray[10] = new Book(11, "9781608465644", "Freedom is a Constant Struggle: Ferguson, Palestine and the Foundations of a Movement", false, "");
        bookArray[11] = new Book(12, "9780316055437", "The Goldfinch", true, "Donna Tartt");
        bookArray[12] = new Book(13, "9780316438520", "Mythology: Timeless Tales of Gods and Heroes", false, "");
        bookArray[13] = new Book(14, "9780062654199", "The Alice Network", true, "Kate Quinn");
        bookArray[14] = new Book(15, "9780525620785", "Mexican Gothic", false, "");
        bookArray[15] = new Book(16, "9781888963373", "RASL", true, "Jeff Smith");
        bookArray[16] = new Book(17, "9781648483066", "Heal Your Past to Manifest Your Future: Trauma-Informed Practices to Release Emotional Blocks and Open to Life's Possibilities", false, "");
        bookArray[17] = new Book(18, "9781645661795", "Motheater", true, "Linda H. Codega");
        bookArray[18] = new Book(19, "9781644031384", "Stitching Stolen Lives: Amplifying Voices, Empowering Youth & Building Empathy Through Quilts; The Social Justice Sewing Academy Remembrance Project", false, "");
        bookArray[19] = new Book(20, "9781616209773", "How Do You Live?", true, "Genzaburo Yoshino");

        System.out.println("Welcome to the Tepatepec Neighborhood Library!");

        while(true) {
            Thread.sleep(1000);
            System.out.println();
            System.out.println("**** System Menu ****");
            System.out.println();
            Thread.sleep(1000);
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("Please select from the above options.");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Available to be checked out: ");
                    for (Book book: bookArray) {
                        if (!book.isCheckedOut) {
                            System.out.println("- ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
                        }
                    }
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println("Check out a book or return to menu?");
                    System.out.println("Press Y for Yes, N for No.");
                    String checkOutResponse = scanner.nextLine();

                    if (checkOutResponse.equalsIgnoreCase("Y")){
                        System.out.println("Enter the book ID to check out: ");
                        int bookSelection = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter your name: ");
                        String patronName = scanner.nextLine();
                        for (Book book: bookArray) {
                            if (bookSelection == book.getId() && !book.isCheckedOut) {
                            book.checkOut(patronName);
                            System.out.println("Book successfully checked out. Thank you for supporting your local neighborhood library!");
                            }
                        }
                    } else {
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Currently checked out: ");
                    for (Book book: bookArray) {
                        if (book.isCheckedOut) {
                            System.out.println("- ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Checked out to " + book.checkedOutTo);
                        }
                    }
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println("Check in a book or return to menu?");
                    System.out.println("Press C to check in, X to Exit.");
                    String response = scanner.nextLine();

                    for (Book book: bookArray) {
                        if (response.equalsIgnoreCase("C")) {
                            System.out.println("Please enter book ID: ");
                            int checkInID = Integer.parseInt(scanner.nextLine());
                            if (book.getId() == checkInID && book.isCheckedOut) {
                                book.checkIn();
                                System.out.println("Book has been checked in. Thank you!");
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.out.println("Thank you for visiting the Tepatepec Neighborhood Library! Stay true to your-shelf :P");
                    System.exit(0);
                    break;
                case 0:
                    System.out.println("Returning to Menu");
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("Selection unavailable. Please select from the following options.");
            }
        }
    }
}