package exercisesControlFlow;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class StudioExercise {
    public static void main(String [] a)
    {
        String s="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with";
        HashMap<String,Integer> result=new HashMap<>();
        char [] chars=s.toCharArray();
        int []counter = new int[256];

        //String length
        int len = s.length();

        for (int i = 0; i < len; i++) {
            counter[s.charAt(i)]++;

        }
        char []array= new char[s.length()];
        for (int i = 0; i < len; i++)
        {
            array[i] = s.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {

                if (s.charAt(i) == array[j])
                    flag++;
            }

            if (flag == 1)
                result.put(Character.toString(s.charAt(i)),counter[s.charAt(i)]);
        }

        for(Map.Entry<String,Integer> e:result.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
