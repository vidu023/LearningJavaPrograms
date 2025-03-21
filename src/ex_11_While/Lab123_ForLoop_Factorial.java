package ex_11_While;

import java.util.Scanner;

public class Lab123_ForLoop_Factorial {
    public static void main(String[] args) {
        // Factorial of a number
        // n! = n * (n-1) * (n-2) *....* 2 * 1
        // For Eg -> 5! = 5 * 4 * 3 * 2 * 1 = 120

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();

        int factorial = 1;
        if (num <= 0) {
            System.out.println(factorial);
        }
        else{
            for(int i = 1; i <= num; i++){
                factorial = factorial * i;
        }

        }

        //factorial of 1
        /*if (num < 1)
            System.out.println(factorial);*/

        System.out.println("Factorial of this number is "+ factorial);
    }
}
