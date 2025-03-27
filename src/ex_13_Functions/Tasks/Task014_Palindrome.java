package ex_13_Functions.Tasks;

import java.util.Scanner;

public class Task014_Palindrome {
    public static void main (String[] args){
        // To Check if the input string is Palindrome or not

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to check if it Palindrome or not: ");
        String str = scanner.nextLine().toLowerCase(); // changing the string entered to lowercase

        String revStr = ""; // initialization of reverse string
        for (int i = (str.length()-1); i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }

        System.out.println("Reverse of the entered String is "+revStr);

        if(str.equals(revStr)) {
            System.out.println(str + " - Its a Palindrome String");
        }
        else{
            System.out.println(str + " - Its not a Palindrome String");
        }

    }
}
