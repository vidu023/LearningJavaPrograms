package ex_06_TernaryOpertor;

public class Lab061_InterviewQnA1 {
    public static void main(String[] args) {
        // Ternary operators are run on one line
        // similar to if else condition

        // Nested Ternary
        //result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        // below example is of simple ternary -> if else
        int number = 5;
        String result =  (number>10) ? "A" : "B";
        System.out.println(result);

        // below example is of nested ternary -> nested if else
        int age = 8;
        //String output =  (age>10) ? "Age is more than 10 years" : (age>20) ? "Age is more than 20" : "Age is less than 10 years";
        //but ideally we should be adding the nested if else in the expression
        String output =  (age>10) ? (age>20) ? "Age is more than 20" : "Age is more than 10 years" : "Age is less than 10 years";
        System.out.println(output);

        // for this it will check if age which is 8 is > 10 -> false so directly last expression will run

        // for the age = 25 it will check 25>10 is true so next if else loop will run
        // i.e. 25>20 is true so its expression more than 20 will run

        // for the age = 15 it will first check 15>10 is true so next if else loop will run
        // i.e. 15>20 is false so its else expression more than 10 will run
    }
}
