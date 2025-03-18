package ex_06_TernaryOpertor;

public class Lab065_CheckAge_SelfTrial {
    public static void main(String[] args) {
        // To check as per the age -> Minor, Adult or Senior
        //Another example of nested ternary

        //3 cases
        //age < 18 -> Minor
        //age > 18 -> Adult
        //age > 65 -> Senior

        int age = 45;
        String m = "You are Minor";
        String a = "You are Adult";
        String s = "You are Senior";

        String output = (age>18) ? (age>65) ? s : a : ((age<18) ? m : a);
        System.out.println(output);


    }
}
