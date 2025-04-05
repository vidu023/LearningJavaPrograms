package ex_16_Arrays;

import java.util.Scanner;

public class Lab155_Array_UserInput {
    public static void main(String[] args) {
        // Ask user to create an array

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array (int only): ");
        int size = scanner.nextInt(); // taking that size and storing it in a value

        // we can use array -> int, float, String etc
        //float[] salary = new float[size];
        //String[] name = new String[size];

        //int type of array
        int[] marks = new int[size]; // defining array length using size entered by the user
        // using for loop we shall take the marks -> elements of array
        System.out.println("Enter the marks of the Student: ");
        for (int i = 0; i < marks.length; i++){
            marks[i] = scanner.nextInt(); // will store the marks in this
        }

        // and now using for loop will print those marks entered by the user
        System.out.println("--------------------");
        System.out.println("Marks of the Student are as follows: ");
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        scanner.close(); // closing the scanner
    }
}
