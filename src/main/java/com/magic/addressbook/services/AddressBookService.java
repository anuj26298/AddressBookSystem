package com.magic.addressbook.services;

import com.magic.addressbook.model.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AddressBookService implements IAddressBookService {

    /**
     * {addressBooks} static map, where we storing addressBook,
     * also using one {currentAddressBook} static variable
     * its mentions current or opened addressBook in which we perform operations.
     */

    public static Map<String, AddressBook> addressBooks = new HashMap<>();
    public static String currentAddressBook = null;

    @Override
    public boolean createAddressBook(String addressBookName) {
        String addressBookId = UUID.randomUUID().toString();

        AddressBook addressBook = new AddressBook(addressBookId, addressBookName, new ArrayList<>());
        addressBooks.put(addressBookName, addressBook);
        return true;
    }

    @Override
    public Map<String, AddressBook> getAllAddressBook() {
        return this.addressBooks;
    }

    @Override
    public boolean openAddressBook(String addressBook) {
        this.currentAddressBook = addressBook;
        return true;
    }

    @Override
    public boolean closeAddressBook() {
        this.currentAddressBook = null;
        return true;
    }
}
