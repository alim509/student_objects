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

        Collections.sort(studentArray);
        System.out.println(studentArray.get(4).getName() + " - " + studentArray.get(4).getGPA());
        System.out.println(studentArray.get(3).getName() + " - " + studentArray.get(3).getGPA());
        System.out.println(studentArray.get(2).getName() + " - " + studentArray.get(2).getGPA());

    }

}
