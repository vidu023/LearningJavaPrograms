package ex_13_Functions.Tasks;

import java.util.Scanner;

public class Task011_ForLoop_FibonacciSeries {
    public static void main (String[] args){
        // Fibonacci Series

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number in Fibonacci Series: ");
        int num = scanner.nextInt();
        int fibo1 = 0, fibo2 = 1;

        for (int i = 0; i < num; i++){
            System.out.println(fibo1);

            int fibo3 = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo3;

        }
    }
}
