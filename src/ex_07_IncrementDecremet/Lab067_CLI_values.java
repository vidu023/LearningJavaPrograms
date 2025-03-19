package ex_07_IncrementDecremet;

public class Lab067_CLI_values {
    public static void main(String[] args) {

        //Taking 4 inputs from the user using CLI
        // starting from array 0 till 3
        //taking input as string

        String a1 = args[0];
        String a2 = args[1];
        String a3 = args[2];
        String a4 = args[3];
        //String a5 = args[4]; //will give error at this point -> Exception Handling
        //ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // -> array starts from 0 till 3 -> 4 values -> 5th value not entered

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }
}
