package ex_09_Switch;

import java.util.Scanner;

public class Lab090_Switch_withoutDefault {
    public static void main(String[] args) {

        // default case is not mentioned here
        // there is no print statement to print & it will come out of the loop
        // it will also not give any error also

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number from 1 to 2: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }
    }
}
