package exercises;
import java.util.Scanner;
public class NumericTypes {
    public static void main (String [] args)
    {
        Scanner input=new Scanner(System.in);
        float miles,gas;
        System.out.println("Enter miles you travelled:");
        miles=input.nextFloat();
        System.out.println("Enter amount of gas you filled:");
        gas=input.nextFloat();
        float average=miles/gas;
        System.out.println("miles-per-gallon:"+average);
    }
}
