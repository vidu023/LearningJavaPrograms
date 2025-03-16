package ex_04_Literals_Operators;

public class Lab039_InterviewQnA2 {
    public static void main(String[] args) {

        String firstName = "Vidya";
        String lastName = "Kini";

        int a = 57;
        int b = 32;

        //no mathematics operation is done below
        //since first 2 operators is String it will treat all as Strings
        System.out.println(firstName+lastName+a+b);
        // VidyaKini5732

        //mathematics operation is done below
        //since first 2 operators is integer it will treat all as mathematical operation
        // but then it will concatenate for Strings
        System.out.println(a+b+firstName+lastName);
        //89VidyaKini
    }
}
