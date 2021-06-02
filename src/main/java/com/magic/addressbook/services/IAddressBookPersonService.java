package com.magic.addressbook.services;

import com.magic.addressbook.model.Person;

import java.util.List;

public interface IAddressBookPersonService {

    boolean addPerson(Person person);
    List<Person> getAllPersons();
}
