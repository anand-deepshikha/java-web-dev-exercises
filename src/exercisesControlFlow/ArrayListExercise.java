package exercisesControlFlow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise {
    public static void main(String [] a)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(25);
        list.add(15);
        list.add(8);
        list.add(22);
        list.add(14);
        list.add(5);
        list.add(20);
        list.add(9);
        list.add(6);
        list.add(14);
        int sum=ArrayListExercise.sumEven(list);
        System.out.println("Sum of all even numbers is:"+sum);
        String string="I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> names=new ArrayList<>(Arrays.asList(string.split(" ")));

        /*names.add("jack");
        names.add("Daniel");
        names.add("Timothy");
        names.add("Ryan");
        names.add("Deepa");*/
        System.out.println("Enter Length of Name to search:");
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        printNames(names,len);
    }
    public static int sumEven(ArrayList<Integer> list1)
    {
        int sum=0;
        for (int i:list1)
        {
            if(i%2==0)
                sum+=i;
        }
        return sum;
    }
    public static void printNames(ArrayList<String> names,int length)
    {
        for(String name:names)
        {
            if(name.length()==length)
                System.out.println(name);
        }
    }
}
