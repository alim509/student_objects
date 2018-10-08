package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentArray = new ArrayList<Student>();
        studentArray.add(new Student("Jimmy Hopkins", 2.67));
        studentArray.add(new Student("Harry Potter", 4.59));
        studentArray.add(new Student("Lindsay Weir", 4.96));
        studentArray.add(new Student("Jimmy Brooks", 3.51));
        studentArray.add(new Student("Claire Standish", 4.02));

        System.out.println("The top three students are:");

        int length = studentArray.size();

        Collections.sort(studentArray);
        System.out.println(studentArray.get(length - 1).getName() + " - " + studentArray.get(length - 1).getGPA());
        System.out.println(studentArray.get(length - 2).getName() + " - " + studentArray.get(length - 2).getGPA());
        System.out.println(studentArray.get(length - 3).getName() + " - " + studentArray.get(length - 3).getGPA());
    }

}
