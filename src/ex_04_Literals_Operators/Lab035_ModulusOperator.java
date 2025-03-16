package ex_04_Literals_Operators;

public class Lab035_ModulusOperator {
    public static void main(String[] args) {

        // % -> Modulus

        byte a = 35;
        byte b = 7;
        float c = 3f;

        System.out.println(a%b); //Remainder is returned
        System.out.println(a%c); //Remainder is returned
        // as this is divisible it will return 0 for modulus
        // Modulus -> Remainder

        // 7 | 35 | 5 -> Where 5 is the Quotient
        //   | 35 |
        //------------
        //     0        -> Remainder as its divisible
        //------------
    }
}
