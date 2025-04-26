package ex_30_ExceptionHandling;

import java.util.Scanner;

public class Lab228_ThrowEg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // instead of throws we can surround the vulnerable code in try catch block
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // the message shown in the exception will be called & printed in case of Exception
        }

    }

    private static void validateAge(int age) throws Exception {
        if(age<18){

            //throw new Exception("NAAH!! You cant go to GOA!!");
            // we know that this statement can throw exception (Exception) & we need a method also to handle it
            // if ArithmeticException given it will not give red line error
            // all methods need to handle the exception

            throw  new ValidAgeException("You are not 18 to go GOA"); // custom Exception

            // we can multiple exception as well
            //private static void validateAge(int age) throws ArithmeticException,NullPointerException{
        }
        else{
            System.out.println("YAY!! You can go to GOA!!!");
        }
    }
}

// I can also create a Custom Exception -> ValidAgeException class with extends Exception class
    class ValidAgeException extends Exception{
        // Parametrized constructor
        ValidAgeException(String msg){
            // call the parent-> Exception constructor using super keyword
            super(msg);
        }
    }
