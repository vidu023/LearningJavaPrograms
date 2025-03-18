package ex_06_TernaryOpertor;

public class Lab062_MaxNumber_2 {
    public static void main(String[] args) {
        // To check which number is maximum

        //Math.max(num1, num2) function is used here
        // many math functions are available like sin, cos, max, min etc

        int a = 69;
        int b = 56;
        System.out.println(Math.max(a,b));

        // same program we can use it in ternary

        //but this is shown as string
        String max = a>b ? "A is Max" : "B is max";
        System.out.println(max);

        //but this is shown as number -> integer
        int output = a>b ? a : b;
        System.out.println(output);



    }
}
