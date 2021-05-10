package exercisesControlFlow;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String [] ar)
    {
        int [] array1={1,1,2,3,5,8};
        for (int i:array1) {
            System.out.println(i);
        }
        System.out.println("Odd numbers in Array are:");
        for (int i:array1) {
            if(i%2!=0)
                System.out.println(i);
        }
        String str1="I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse";
        /*String [] strArray=str1.split(" ");
        for (String s:strArray) {
            System.out.println(s);
        }*/
        String [] strArray1=str1.split("\\.");
        //System.out.println(strArray1.length);
        for (String s:strArray1) {
            System.out.println(s);
        }
    }
}
