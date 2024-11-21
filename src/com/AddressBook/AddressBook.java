package com.AddressBook;
import com.AddressBook.Contact;
import java.util.ArrayList;
import java.util.Iterator;
import  java.util.Scanner;

public class AddressBook {
    private final ArrayList<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void viewContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contactList) {
                System.out.println(contact.getFirstName() + " " + contact.getLastName() + ", " +
                        contact.getAddress() + ", " + contact.getCity() + ", " + contact.getState() + ", " +
                        contact.getZip() + ", " + contact.getPhoneNumber() + ", " + contact.getEmail());
            }
        }
    }

    public void editContact(String firstName, String lastName) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println("Contact found! Enter new details:");
                Scanner sc = AddressBookMain.sc;
                System.out.print("New Address: ");
                contact.setAddress(sc.next());
                System.out.print("New City: ");
                contact.setCity(sc.next());
                System.out.print("New State: ");
                contact.setState(sc.next());
                System.out.print("New Zip Code: ");
                contact.setZip(sc.next());
                System.out.print("New Phone Number: ");
                contact.setPhoneNumber(sc.next());
                System.out.print("New Email: ");
                contact.setEmail(sc.next());
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("No contact found with the given name.");
    }

    public void deleteContact(String firstName, String lastName) {
        Iterator<Contact> iterator = contactList.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName)) {
                iterator.remove();
                System.out.println("Contact deleted successfully!");
                return;
            }
        }
        System.out.println("No contact found with the given name.");
    }
}
