package com.magic.addressbook.services;

import com.magic.addressbook.model.Person;

import java.util.List;

public class AddressBookPersonService implements IAddressBookPersonService {

    @Override
    public boolean addPerson(Person person) {
        String currentBook = AddressBookService.currentAddressBook;
        return AddressBookService.addressBooks     /* static addressBook map {addressBooks} */
                .get(currentBook)                  /* fetching by key means by putting address book name, which we opened*/
                .addressBook                       /* its returning now persons list from addressBook */
                .add(person);                      /* adding person in list using add. */
    }

    @Override
    public List<Person> getAllPersons() {
        String currentBook = AddressBookService.currentAddressBook;
        return AddressBookService.addressBooks
                .get(currentBook)
                .addressBook;
    }
}
