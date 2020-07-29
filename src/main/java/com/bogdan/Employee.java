package com.bogdan;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Employee {

    private String firstname;
    private String surname;
    private List<Phone> phones;
    private String email;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Address> address;

    public Employee(String firstname, String surname, List<Phone> phones, String email, List<Address> address) {
        this.firstname = firstname;
        this.surname = surname;
        this.phones = phones;
        this.email = email;
        this.address = address;
    }

    public Employee() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    @JacksonXmlElementWrapper(localName="phones")
    @JacksonXmlProperty(localName="number")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + phones +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
