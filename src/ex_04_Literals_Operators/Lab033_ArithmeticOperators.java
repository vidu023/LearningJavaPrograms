package ex_04_Literals_Operators;

public class Lab033_ArithmeticOperators {
    public static void main(String[] args) {

        // Arithmetic Operators
        // + -> Addition
        // - -> Subtraction
        // * ->  Multiplication
        // / -> Division
        // % -> Modulus

        byte a = 35;
        byte b = 7;
        float c = 3f;
        System.out.println(a+b); //Added
        System.out.println(a-b); // Subtracted
        System.out.println(a*b); //Multiplied
        System.out.println(a/b); //Divided
        // division will return byte type of value i.e. integral

        //if you divide by float it will return float type of value
        System.out.println(a/c);

    }
}
