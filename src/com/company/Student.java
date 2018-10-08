package com.company;

public class Student implements Comparable<Student>{

    private String studName = null;
    private double studGPA = 0;

    public Student(String name, double gpa) {

        studName = name;
        studGPA = gpa;

    }

    public String getName() {

        return studName;

    }

    public double getGPA() {

        return studGPA;

    }

    public int compareTo(Student student){

        return Double.valueOf(studGPA).compareTo(student.getGPA());

    }

}