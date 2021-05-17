package org.launchcode.java.demos.lsn3classes1;

import  java.util.Scanner;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student s=new Student();
        Scanner in=new Scanner(System.in);
        String name;
        int id,numOfCredits;
        double gpa;
        System.out.println("Enter Student ID:");
        id=in.nextInt();
        System.out.println("Enter Student NAme:");
        name=in.next();
        System.out.println("Enter Number Of Credits:");
        numOfCredits=in.nextInt();
        System.out.println("Enter GPA:");
        gpa=in.nextDouble();
        s.setStudentId(id);;
        s.setName(name);
        s.setNumberOfCredits(numOfCredits);
        s.setGpa(gpa);
        System.out.println("Student id:"+s.getStudentId());
        System.out.println("Student Name:"+s.getName());
        System.out.println("Student NumberOfCredits:"+s.getNumberOfCredits());
        System.out.println("Student GPA:"+s.getGpa());
    }
}
