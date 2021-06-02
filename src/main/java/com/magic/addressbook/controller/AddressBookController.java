package com.magic.addressbook.controller;

import com.magic.addressbook.model.AddressBook;
import com.magic.addressbook.services.AddressBookService;
import com.magic.addressbook.services.IAddressBookService;

import java.util.Map;
import java.util.Scanner;

public class AddressBookController {

    private Scanner scanner = new Scanner(System.in);
    private IAddressBookService bookService = new AddressBookService();

    public void getAllAddressBook() {
        Map<String, AddressBook> allAddressBook = this.bookService.getAllAddressBook();
        System.out.println(allAddressBook);
    }

    public void createAddressBook() {
        System.out.println("Enter AddressBook Name \n");
        String addressBookName = scanner.nextLine();
        bookService.createAddressBook(addressBookName);
    }

    public boolean openAddressBook() {
        Map<String, AddressBook> allAddressBook = this.bookService.getAllAddressBook();
        System.out.println(allAddressBook.keySet());
        System.out.println("Select One AddressBook !!");
        String addressBook = scanner.nextLine();
        return this.bookService.openAddressBook(addressBook);
    }

    public boolean closeAddressBook() {
       return this.bookService.closeAddressBook();
    }
}
