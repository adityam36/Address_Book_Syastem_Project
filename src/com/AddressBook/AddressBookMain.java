package com.AddressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book!");

        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the contact details:");
                    System.out.print("First Name: ");
                    String firstName = sc.next();
                    System.out.print("Last Name: ");
                    String lastName = sc.next();
                    System.out.print("Address: ");
                    String address = sc.next();
                    System.out.print("City: ");
                    String city = sc.next();
                    System.out.print("State: ");
                    String state = sc.next();
                    System.out.print("Zip Code: ");
                    String zip = sc.next();
                    System.out.print("Phone Number: ");
                    String phoneNumber = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();

                    Contact contact = new Contact(firstName, lastName, address, city, state, email, phoneNumber, zip);
                    addressBook.addContact(contact);
                    System.out.println("Contact added successfully!");
                }
                case 2 -> {
                    System.out.println("Current Contacts:");
                    addressBook.viewContacts();
                }
                case 3 -> {
                    System.out.print("Enter the first name of the contact to edit: ");
                    String editFirstName = sc.next();
                    System.out.print("Enter the last name of the contact to edit: ");
                    String editLastName = sc.next();
                    addressBook.editContact(editFirstName, editLastName);
                }
                case 4 -> {
                    System.out.print("Enter the first name of the contact to delete: ");
                    String deleteFirstName = sc.next();
                    System.out.print("Enter the last name of the contact to delete: ");
                    String deleteLastName = sc.next();
                    addressBook.deleteContact(deleteFirstName, deleteLastName);
                }
                case 5 -> {
                    System.out.println("Exiting Address Book. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
