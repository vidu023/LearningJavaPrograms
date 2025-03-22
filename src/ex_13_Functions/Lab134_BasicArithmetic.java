package ex_13_Functions;

import java.util.Scanner;

public class Lab134_BasicArithmetic {
    // Basic Arithmetic Function
    // Calling method - by passing arguments & returning the value back

    // Edge case need to be fixed - if someone enters a string instead of a number say -> vidya then?
    // code breaks
    // user should not enter anything apart from integer value

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Edge case not considered
        //System.out.println("Enter two numbers: ");
        //int a = scanner.nextInt();
        //int b = scanner.nextInt();

        // Edge case considered using if else statement
        System.out.println("Enter Number 1: ");
        int a = 0;
        if(scanner.hasNextInt()){ // check if the entered value is integer or not
            a = scanner.nextInt();
        }else{
            System.out.println("You have not entered a number");
            System.exit(0);
        }
        System.out.println("Enter Number 2: ");
        int b = 0;
        if(scanner.hasNextInt()){ // check if the entered value is integer or not
            b = scanner.nextInt();
        }else{
            System.out.println("You have not entered a number");
            System.exit(0);
        }

        int add = addition(a,b);
        System.out.println("Addition of two numbers is: "+add);
        int sub = subtraction(a,b);
        System.out.println("Subtraction of two numbers is: "+sub);
        int mul = multiplication(a,b);
        System.out.println("Multiplication of two numbers is: "+mul);
        int div = division(a,b);
        System.out.println("Division of two numbers is: "+div);
        int mod = modulus(a,b);
        System.out.println("Modulus of two numbers is: "+mod);

    }

    static int addition(int a,int b){
        return a + b;
    }

    static int subtraction(int a,int b) {
        return a - b;
    }

    static int multiplication(int a,int b) {
        return a * b;
    }

    static int division(int a,int b) {
        //Similarly division by 0 is not allowed
        // it will break the code
        if (b == 0){
            System.out.println("Division by 0 is not possible");
            System.exit(0);
        }
        return a / b;
    }

    static int modulus(int a,int b) {
        return a % b;
    }
}
