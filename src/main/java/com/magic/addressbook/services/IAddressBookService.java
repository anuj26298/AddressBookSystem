package com.magic.addressbook.services;

import com.magic.addressbook.model.AddressBook;

import java.util.Map;

public interface IAddressBookService {

    boolean createAddressBook(String addressBook);
    boolean openAddressBook(String addressBook);
    boolean closeAddressBook();
    Map<String, AddressBook> getAllAddressBook();
}
