package ex_08_Condition_IfElse;

public class Lab085_IfElseCondition {
    public static void main(String[] args) {
        // Taking age as input from the user

        String a = args[0];
        int age = Integer.parseInt(a);

        //CLI Options
        //int age = Integer.parseInt(args[0]);

        if (age>= 18){
            System.out.println("Yay! You are allowed to Vote!");
        }else{
            System.out.println("Naah! You are still not allowed to Vote!");
        }
    }
}
