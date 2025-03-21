package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab_While_GuessingGame {
    public static void main(String[] args) {
        // Guessing Game - Guess a number between 1 and 100

        // Random number provided by machine
        Random random = new Random(); // Random is a class in java which will provide you a random number
        int guessNum = random.nextInt(100)+1; // range from 1 to 100
        // -> (100) + 1 -> 100 numbers & +1 means including 100
        //System.out.println(guessNum); // prints the random number

        //Guess a number by user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1-100: ");

        int guess;
        int attempts = 0;

        while (true){
            guess = scanner.nextInt();
            attempts ++;

            if(guess<guessNum){
                System.out.println("Too Low, Try Again!");
            }
            else if (guess>guessNum){
                System.out.println("Too High, Try Again");
            }
            else{
                System.out.println("You Guessed it Correct in "+ attempts+ " attempts.");
            }

        }


    }
}
