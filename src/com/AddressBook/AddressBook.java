package com.AddressBook;

import java.util.ArrayList;

public class AddressBook
{
    public ArrayList<Contact> contactList = new ArrayList<>();
    public  ArrayList<Contact> contactList(Contact d)
    {
        contactList.add(d);
        return contactList;
    }
}
