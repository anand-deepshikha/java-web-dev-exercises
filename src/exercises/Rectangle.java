package exercises;

import java.awt.*;
import java.util.Scanner;

public class Rectangle {
    public static void main (String [] args)
    {
        Scanner input=new Scanner(System.in);
        float length,width;
        System.out.println("Enter Length of Rectangle:");
        length=input.nextFloat();
        System.out.println("Enter width of Rectangle:");
        width=input.nextFloat();
        float area=length*width;
        System.out.println("Area of rectangle is:"+area);
    }
}

