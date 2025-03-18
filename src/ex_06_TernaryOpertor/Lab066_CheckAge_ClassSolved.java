package ex_06_TernaryOpertor;

public class Lab066_CheckAge_ClassSolved {
    public static void main(String[] args) {
        // To check  the age of the user
        // Take input from the user here

        //3 cases
        //age < 18 -> Minor
        //age > 18 -> Adult
        //age > 65 -> Senior

        // it will take input from user through command line
        // it will be stored as string
        String age = args [0];
        // args [0] -> it can take multiple values // array concept starts with 0 -> fetching 1st element

        //to take input from user -> Run main function once
        // choose from current file drop down -> select Edit Configurations
        // pass value as string in Program arguments

        System.out.println(age);
        //System.out.println(age instanceof String); // to check if its true -> here age is string or not

        int age1 = Integer.parseInt(age); // converting string to integer value
        // it's a type of typecasting -> type conversion
        //wrapper class

        String result = (age1< 18) ? "Minor" : (age1< 65) ? "Adult" : "Senior";
        System.out.println(result);

    }
}
