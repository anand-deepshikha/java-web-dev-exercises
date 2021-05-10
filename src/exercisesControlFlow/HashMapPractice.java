package exercisesControlFlow;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main (String [] a)
    {
        HashMap<Integer,String> students=new HashMap<>();
        Scanner in=new Scanner(System.in);
        int id;
        System.out.println("Enter Id for students:(enter 0 to exit)-");
        do {
            System.out.println("ID:-");
            id=in.nextInt();
            if(id!=0)
            {
                System.out.println("Student Name:");
                String name=in.next();
                students.put(id,name);
                in.nextLine();
            }
        }while(id!=0);
        System.out.println("Student Data:");
        System.out.println("Id\tName");
        for(Map.Entry<Integer,String> student:students.entrySet())
        {
            System.out.println(student.getKey()+"\t"+student.getValue());
        }
    }

}
