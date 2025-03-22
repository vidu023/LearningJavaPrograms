package ex_13_Functions;

public class Lab131_RealEx_ReturnsSum {
    public static void main(String[] args) {

        //passing the arguments & returning value
        // passing 2 numbers & returning their sum

        // Real example of calling the same function more than once
        // by passing different values
        // instead of writing this function more than 1
        int output1 = sum_2Num(3,7);
        System.out.println(output1);

        int output2 =sum_2Num(5,8);
        System.out.println(output2);

        int output3 =sum_2Num(2,16);
        System.out.println(output3);

        int output4 =sum_2Num(15,22);
        System.out.println(output4);

        int output5 =sum_2Num(6,18);
        System.out.println(output5);

    }
    static int sum_2Num(int a, int b){
        return a+b;
    }
}
