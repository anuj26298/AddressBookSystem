package com.magic.addressbook.controller;

import com.magic.addressbook.model.Person;
import com.magic.addressbook.services.AddressBookPersonService;
import com.magic.addressbook.services.IAddressBookPersonService;

import java.util.List;
import java.util.Scanner;

public class AddressBookPersonController {

    private Scanner scanner = new Scanner(System.in);
    private IAddressBookPersonService personService = new AddressBookPersonService();

    /**
     *  Add person
     */
    public void addPerson() {
        System.out.println("Enter Person Name \n");
        String name = scanner.nextLine();
        System.out.println("Enter Person City \n");
        String city = scanner.nextLine();
        System.out.println("Enter Person State \n");
        String state = scanner.nextLine();

        Person person = new Person(name, city, state);
        this.personService.addPerson(person);
    }


    /**
     * Get All Persons
     * print list in user friendly way ....
     */
    public void getAllPersons() {
        List<Person> allPersons = this.personService.getAllPersons();
        System.out.println(allPersons);
    }
}
