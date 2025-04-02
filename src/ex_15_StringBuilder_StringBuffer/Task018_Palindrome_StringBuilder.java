package ex_15_StringBuilder_StringBuffer;

import java.util.Scanner;

public class Task018_Palindrome_StringBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string  to check if its a palindrome or not: ");
        String output = scanner.next();
        //String newString = reverseString(output);
        String newString = reverseStringSB(output);

        if (newString.equalsIgnoreCase(output)){
            System.out.println("Its a palindrome");
        }
        else {
            System.out.println("Its not a Palindrome");
        }
    }

    private static String reverseString(String output) {
        String reversed = "";
        for (int i = output.length()-1; i >= 0; i--){
            reversed = reversed + output.charAt(i);

        }
        return reversed;
    }

    private static String reverseStringSB(String output) {
        StringBuilder strnbd = new StringBuilder(output);
        return strnbd.reverse().toString();
    }
}
