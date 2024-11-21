package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");

        AddressBook addressBook = new AddressBook();
        System.out.println("Enter the contact details.............");
        System.out.println("Enter the first name:");
        String firstName = sc.next();
        System.out.println("Enter the last name:");
        String lastName = sc.next();
        System.out.println("Enter the address:");
        String address = sc.next();
        System.out.println("Enter the city:");
        String city = sc.next();
        System.out.println("Enter the state:");
        String state = sc.next();
        System.out.println("Enter the zip code:");
        String zip = sc.next();
        System.out.println("Enter the phone no:");
        String phoneNumber = sc.next();
        System.out.println("Enter the email:");
        String email = sc.next();
       Contact d = new Contact(firstName, lastName, address, city, state, email, phoneNumber, zip);

        ArrayList<Contact> contactList = addressBook.contactList(d);
        for(Contact contact:contactList)
        {
            System.out.println(contact.getFirstName()+" "+contact.getLastName()+" "+contact.getAddress()+" "+contact.getCity()+
                    " "+contact.getState()+" "+contact.getEmail()+" "+contact.getPhoneNumber()+" "+contact.getZip());
        }

    }
}
