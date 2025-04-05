package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_ArrayPrint_ForLoop {
    public static void main (String[] ars){

        int[] marks = {95,88,92,99,100,85,87};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);

        // Using For Loop to print the elements
        System.out.println("-----------------------");
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        // to sort the marks using Arrays class & then print
        // generally used for collection framework
        Arrays.sort(marks); // it will sort in ascending order
        System.out.println("-----------------------");
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
