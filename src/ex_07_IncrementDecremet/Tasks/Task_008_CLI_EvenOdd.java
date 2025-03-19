package ex_07_IncrementDecremet.Tasks;

public class Task_008_CLI_EvenOdd {
    public static void main (String[] args){

        //To check the input given by user is Even or Odd

        String a = args[0];
        int num = Integer.parseInt(a);

        String result = (num%2 ==0) ? "Even Number" : "Odd Number";

        System.out.println(num);
        System.out.println(result);

        /*Output
        55
        Odd Number */
    }
}
