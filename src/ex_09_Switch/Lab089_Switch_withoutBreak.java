package ex_09_Switch;

import java.util.Scanner;

public class Lab089_Switch_withoutBreak {
    public static void main(String[] args) {
        // Switch without break
        //Take a user input -> number from 1 to 7 & Tell then its day accordingly
        // 1-> Monday, 2 -> Tuesday.... 7-> Sunday
        //8 -> Not allowed / Error

        // it will match  the case number against the input & execute all the statement until the loop finishes
        // it will give wrong output
        // as it will execute all the statements from the matching case number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number from 1 to 7: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Day");

        }


    /*Output -
    Enter a Number from 1 to 7:
    5
    Friday
    Saturday
    Sunday
    Invalid Day*/
    }

}
