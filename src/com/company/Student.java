package com.company;

/**
 * Created by al5091 on 10/5/18.
 */
public class Student {

    private String name = null;
    private double GPA = 0;

    public Student(String arg1, double arg2) {
        name = arg1;
        GPA = arg2;
    }

    public String getName(){
        return name;
    }

    public double getGPA(){
        return GPA;
    }

}