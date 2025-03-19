package ex_07_IncrementDecremet.Tasks;

public class Task_006_CLI_Max2Num_MathF {
    public static void main (String[] args){

        //Finding Max 2 numbers using Math.max(num1, num2) function using CLI
        //Taking inputs from the user

        String a = args[0];
        String b = args[1];

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int result = Math.max(num1, num2);
        System.out.println("Max number is "+ result);
    }
}
