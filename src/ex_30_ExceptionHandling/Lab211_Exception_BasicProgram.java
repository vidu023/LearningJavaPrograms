package ex_30_ExceptionHandling;

public class Lab211_Exception_BasicProgram {
    public static void main(String[] args) {
        // Basic small program
        // -> Taking input from the user, dividing by 100 & giving back output

        System.out.println("Staring the Program");
        String input = args[0]; // ArrayIndexOutOfBoundsException -> if no arguments are passed
        int a = Integer.parseInt(input); // NumberFormatException -> if String is entered in place of int
        int output = 100/a; // ArithmeticException -> divide by 0 not possible
        System.out.println(output);
        System.out.println("End of the Program");

        // it has 3 exceptions & it must be handled -> all are unchecked exceptions -> runtime
        // to give best experience to a user

    }
}
