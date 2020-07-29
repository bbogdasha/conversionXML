package com.bogdan;

import java.util.List;

public class University {

    private String speciality;
    private int number;
    private List<Student> students;

    public University(String speciality, int number, List<Student> students) {
        this.speciality = speciality;
        this.number = number;
        this.students = students;
    }

    public University() {

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
