package com.bogdan;

public class Student {

    private int id;
    private String firstname;
    private String surname;
    private int age;
    private boolean budget;

    public Student(int id, String firstname, String surname, int age, boolean budget) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBudget() {
        return budget;
    }

    public void setBudget(boolean budget) {
        this.budget = budget;
    }
}
