package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Scanner;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setName(String aName)
    {
        this.name=aName;
    }

    public String getName()
    {
        return this.name;
    }
    public int getStudentId()
    {
        return this.studentId;
    }
    public void setStudentId(int aStudentId)
    {
        this.studentId=aStudentId;
    }
    public int getNumberOfCredits()
    {
        return this.numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits)
    {
        this.numberOfCredits=aNumberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGradeLevel(int credits)
    {
        if(credits<=29)
            return "Freshman";
        else if(credits<=59)
            return "Sophomore";
        else if(credits<=89)
            return "Junior";
        else
            return "Senior";

    }

}



