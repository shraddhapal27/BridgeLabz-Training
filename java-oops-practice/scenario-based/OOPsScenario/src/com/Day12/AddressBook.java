package com.Day12;

import java.util.*;

class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate check
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("Duplicate contact not allowed!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Edit contact by name
    public void editContact(String name, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact by name
    public void deleteContact(String name) {
        Iterator<Contact> itr = contacts.iterator();
        while (itr.hasNext()) {
            if (itr.next().getFirstName().equalsIgnoreCase(name)) {
                itr.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Search by city or state
    public void searchByCityOrState(String value) {
        for (Contact c : contacts) {
            Address a = c.getAddress();
            if (a.getCity().equalsIgnoreCase(value)
                || a.getState().equalsIgnoreCase(value)) {
                System.out.println(c);
            }
        }
    }

    // Display sorted contacts
    public void displayContacts() {
        Collections.sort(contacts);
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
