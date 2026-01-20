package com.Day12;

public class AddressBookApp {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address a1 = new Address("Indore", "MP", "452001");
        Address a2 = new Address("Bhopal", "MP", "462001");

        Contact c1 = new Contact("Rahul", "Sharma",
                "9999999999", "rahul@gmail.com", a1);

        Contact c2 = new Contact("Amit", "Verma",
                "8888888888", "amit@gmail.com", a2);

        book.addContact(c1);
        book.addContact(c2);

        book.displayContacts();

        System.out.println("\nSearch by city:");
        book.searchByCityOrState("Indore");

        book.editContact("Rahul", "7777777777", "rahul_new@gmail.com");

        book.deleteContact("Amit");

        System.out.println("\nFinal Contact List:");
        book.displayContacts();
    }
}
