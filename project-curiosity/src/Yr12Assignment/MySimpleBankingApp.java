package Yr12Assignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;
import helpers.Keyboard;
import helpers.ArrayHelper;

public class MySimpleBankingApp {

    public static double balance = 250.00;

    public static String currency = " Euros";

    public static String[] transactions = new String[5];

    public static String[] contacts = { "melb1234", "wchurchill456" };

    public static void main(String[] args) {

        // We are calling this method first to load data
        init();

        // Provide a menu of options:
        Menu();

        // Declare char userChoice and set it to 'A' by default
        char userChoice = 'A';
        char contin = 'y';

        System.out.println("Choose your operation: ");
        userChoice = Keyboard.readChar();

        while (userChoice != 'D' && contin == 'y') {
            switch (userChoice) {
                case 'A':
                    // Printing the past Transcations and the balance you have left in the account
                    System.out.println("Past Transaction Information: ");
                    ArrayHelper.printElements(transactions);
                    System.out.println("Current balance: ");
                    System.out.println(balance + currency);
                    break;
                case 'B':
                    // Entering the amount you wish to put into the account
                    System.out.println("Enter the amount you wish to add to your account(Maximum is 250): ");
                    double amount = Keyboard.readDouble();

                    // If the amount is over 250 or less than or equal to 0, it rejects
                    if (amount > 250) {
                        System.out.println("Amount invalid!, please try again");
                    } else if (amount <= 0) {
                        System.out.println("Amount invalid!, please try again");
                    } else {
                        // calculate the amount plus the balance
                        balance += amount;
                        System.out.println("Amount added: " + amount + currency);
                        System.out.println("New balance: " + balance + currency);
                    }
                    break;
                case 'C':
                    // Entering the amount you wish to send
                    System.out.println("Enter the amount you wish to send(Maximum is balance): ");
                    amount = Keyboard.readDouble();

                    // If the amount is over your balance or less than or equal to zero, it rejects
                    if (amount > balance) {
                        System.out.println("Amount invalid!, please try again");
                    } else if (amount <= 0) {
                        System.out.println("Amount invalid!, please try again");
                    } else {
                        // Getting and printing the contacts
                        ArrayHelper.printElements(contacts);

                        // Asking to who does the user want to send it too
                        System.out.println("To whom you wish to send: ");
                        String receiver = Keyboard.readString();
                        System.out.println("--------------------------------------");

                        // If one of the two contacts is written, it executes
                        if (receiver.equals(contacts[0])) {
                            // deducte the amount sent from the balance
                            balance -= amount;
                            System.out.println("Amount sent: " + amount + currency);
                            System.out.println("New balance: " + balance + currency);
                        } else if (receiver.equals(contacts[1])) {
                            balance -= amount;
                            // deducte the amount sent from the balance
                            System.out.println("Amount sent: " + amount + currency);
                            System.out.println("New balance: " + balance + currency);
                        } else {
                            // else it says wrong receiver
                            System.out.println("Wrong receiver, please try again");
                        }
                    }
                    break;
                default:
                    System.out.println("Not valid Choice. Try again");
                    System.out.println("--------------------------------------");
                    main(args);
            }
            System.out.println("--------------------------------------");

            // Asking the user if they wish to continue
            System.out.println("Do you want to continue? (y/n)");
            contin = Keyboard.readChar();
            System.out.println("--------------------------------------");

            // If they do, it prints the Menu and restarts the choosing operation
            if (contin == 'y') {
                Menu();
                System.out.println("Choose your operation: ");
                userChoice = Keyboard.readChar();
            }
        }
        System.out.println("Thank you for your services and have a nice day!");
    }

    // Menu Displayed
    public static void Menu() {
        System.out.println("A. Display Account Information");
        System.out.println("B. Add Money");
        System.out.println("C. Send Money");
        System.out.println("D. Quit");
        System.out.println("--------------------------------------");
    }

    // Loading the txt file
    public static void init() {
        // make sure you have a text file
        File file = new File("project-curiosity\\src\\Yr12Assignment", "MySimpleTransactions.txt");
        if (file.exists()) {
            int lines;
            try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
                lines = (int) stream.count();
                stream.close();
                if (lines > 0) {
                    Scanner fileScan = new Scanner(file);
                    for (int i = 0; i < lines; i++) {
                        transactions[i] = fileScan.nextLine();
                    }
                    fileScan.close();
                }
            } catch (IOException e) {
                System.out.println("Err: Did not manage to load data.");
            }
        }
    }
}
