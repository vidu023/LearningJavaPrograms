package ex_08_Condition_IfElse;

import java.util.Scanner;

public class Lab086_InputFromScanner {
    public static void main(String[] args) {
        // Taking input from user using Scanner class
        // will use it in OOPS

        Scanner scanner = new Scanner(System.in); // creating a new instance of Scanner class
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // return an integer value
        System.out.println(age);

    }
}
