package com.bogdan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select operation (1 or 2): \n1. XML to Java objects. \n2. Java objects to XML.");
        int num = sc.nextInt();
        System.out.println("Selected " + num + " operation.");

        switch (num){
            case 1:
                Converter.XMLToObjects();
                break;
            case 2:
                List<Student> students = new ArrayList<Student>();
                students.add(new Student(1, "Felix", "Hodor", 21, false));
                students.add(new Student(2, "Bilbo", "Begins", 28, false));
                students.add(new Student(3, "Frodo", "Begins", 19, true));
                students.add(new Student(4, "Gendalf", "Grey", 89, true));
                students.add(new Student(5, "Gimli", "Axe", 24, false));
                University university = new University("Cybersecurity", 125, students);
                Converter.objectsToXML(university);
                break;
            default:
                System.out.println("Entered wrong operation!");
        }
    }
}
