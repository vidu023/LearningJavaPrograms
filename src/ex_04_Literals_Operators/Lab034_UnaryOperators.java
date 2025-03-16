package ex_04_Literals_Operators;

public class Lab034_UnaryOperators {
    public static void main(String[] args) {

        //Unary Operators
        int a = +205;
        int b = -155;

        int result1 = a+b;
        int result2 = a-b;
        int result3 = b-a;


        // + by default doesn't get printed & only negative sign
        System.out.println(a);
        System.out.println(b);

        //Results using unary operators with different combinations
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
