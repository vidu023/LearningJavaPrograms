package ex_09_Switch;

import java.util.Scanner;

public class Lab088_Switch_withBreak {
    public static void main(String[] args) {
        // Switch with break
        //Take a user input -> number from 1 to 7 & Tell then its day accordingly
        // 1-> Monday, 2 -> Tuesday.... 7-> Sunday
        //8 -> Not allowed / Error

        // it will match  the case number against the input & execute the statement & break from the loop

        //but even this switch statement has errors
        // what if user enters apart from integer say a char or a string -
        // it will throw a mismatch exception - no match with case num &
        // to handle such situations we need to know exception handling

        /* Output-
          Enter a Number from 1 to 7:
          vidya
          Exception in thread "main" java.util.InputMismatchException */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number from 1 to 7: ");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;

        }

    }
}
