package ex_11_While;

import java.util.Scanner;

public class Lab124_While_Factorial {
    public static void main (String[] args){
        // Factorial program using while loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number whose Factorial you want to know: ");
        int num = scanner.nextInt();

        int factorial = 1;
        int i = 1;
          if (i <= 0){
              System.out.println("Factorial is 1");
          }
          else{
              while(i<= num){
                  factorial = factorial * i;
                  i++;
              }
              System.out.println("Factorial of "+num+ " is: "+factorial);
          }
    }

}
