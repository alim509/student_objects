package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentArray = new ArrayList<Student>();
        studentArray.add(new Student("Jimmy Hopkins", 2.67));
        studentArray.add(new Student("Harry Potter", 4.59));
        studentArray.add(new Student("Lindsay Weir", 4.96));
        studentArray.add(new Student("Jimmy Brooks", 3.51));
        studentArray.add(new Student("Claire Standish", 4.02));

        //System.out.println(studentArray.get(1).getName());

    }
}
