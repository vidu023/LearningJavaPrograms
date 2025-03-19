package ex_07_IncrementDecremet.Tasks;

public class Task_006_CLI_Max2Num_TernaryOp {
    public static void main (String[] args) {

        //Finding Max 2 numbers using Ternary Operator using CLI
        //Taking inputs from the user

        String a = args[0];
        String b = args[1];

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int result = num1 > num2 ? num1 : num2;

        System.out.println("Max number is "+ result);

        /*Output
        Max number is 77*/
    }
}
