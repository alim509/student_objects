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

    public static Comparator<Student> GPAComparator = new Comparator<Student>() {

        public double compare(Student s1, Student s2) {

            double gpa1 = s1.getGPA();
            double gpa2 = s2.getGPA();

            /*For ascending order*/
            //return gpa1-gpa2;

            /*For descending order*/
            return gpa2-gpa1;
        }};
}