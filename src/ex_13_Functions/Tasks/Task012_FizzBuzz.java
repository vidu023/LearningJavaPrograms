package ex_13_Functions.Tasks;

import java.util.Scanner;

public class Task012_FizzBuzz {
    public static void main(String[] args) {
        // FizzBuzz Program

        for (int i = 1; i<= 100; i++){
            System.out.println(i);
            if(i % 3 == 0){
                System.out.println(i+ " - Fizz");
            } else if (i % 5 == 0 ) {
                System.out.println(i+ " - Buzz");
            } if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i+ " - FizzBuzz");
            }
        }


    }
}
