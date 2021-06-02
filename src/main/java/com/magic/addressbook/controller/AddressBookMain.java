package com.magic.addressbook.controller;

import java.util.Scanner;

public class AddressBookMain {

    public static boolean abort = false;
    private Scanner scanner = new Scanner(System.in);
    private AddressBookController bookController = new AddressBookController();
    private AddressBookPersonController personController = new AddressBookPersonController();

    public static void main(String[] args) {

        AddressBookMain addressBookMain = new AddressBookMain();
        while (true) addressBookMain.addressBookCRUD();
    }

    public void addressBookCRUD() {
        abort = false;
        int i = this.bookInputs();
        switch (i) {
            case 1:
                this.bookController.createAddressBook();
                break;

            case 2:
                this.bookController.getAllAddressBook();
                break;

            case 3:
                if (this.bookController.openAddressBook()) {
                    while (!abort) this.personCRUD();
                }
            default:
                break;
        }
    }

    public void personCRUD() {
        int i = this.personInputs();
        switch (i) {
            case 1:
                this.personController.addPerson();
                break;

            case 2:
                this.personController.getAllPersons();
                break;

            case 3:
                this.bookController.closeAddressBook();
                abort = true;
                this.addressBookCRUD();

            default:
                break;
        }
    }

    public int personInputs() {
        System.out.println(
                "1.Add Person \n" +
                        "2.Show Persons \n" +
                        "3.close AddressBook \n"
        );
        return scanner.nextInt();
    }


    public int bookInputs() {
        System.out.println(
                "1.Create AddressBook \n" +
                        "2.Get All AddressBook \n" +
                        "3.Open AddressBook \n"
        );
        return scanner.nextInt();
    }


}
