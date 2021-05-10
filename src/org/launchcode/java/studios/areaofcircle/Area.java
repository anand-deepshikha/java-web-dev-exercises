package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double radius,area;
        System.out.println("Enter Radius of Circle:");
        if(input.hasNext()) {
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                while(radius<=0)
                {
                    System.out.println("Please enter positive number:");
                    radius = input.nextDouble();
                }

                area = Circle.getArea(radius);
                System.out.println("Area of circle is: " + area);
            } else {
                System.out.println("invalid input");
            }
        }
        else
        {
            System.out.println("No input");
        }
    }
}
