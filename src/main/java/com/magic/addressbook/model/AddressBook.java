package com.magic.addressbook.model;

import java.util.List;

public class AddressBook {

    public String id;
    public String name;
    public List<Person> addressBook;

    public AddressBook(String id, String name, List<Person> addressBook) {
        this.id = id;
        this.name = name;
        this.addressBook = addressBook;
    }

    @Override
    public String toString() {
        return '{' +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", addressBook=" + addressBook +
                '}';
    }
}
