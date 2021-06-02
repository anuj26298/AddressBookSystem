package com.magic.addressbook.model;

public class Person {

    public String name;
    public String city;
    public String zip;

    public Person(String name, String city, String zip) {
        this.name = name;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
