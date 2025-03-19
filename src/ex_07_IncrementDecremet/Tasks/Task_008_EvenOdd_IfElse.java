package ex_07_IncrementDecremet.Tasks;

import java.util.Scanner;

public class Task_008_EvenOdd_IfElse {
    public static void main(String[] args) {
        //To check number is Even or Odd using If Else loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num);

        if (num %2 == 0){
            System.out.println("Its an Even Number");
        }else{
            System.out.println("Its a Odd Number");
        }
    }
}
