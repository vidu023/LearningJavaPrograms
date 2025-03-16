package ex_04_Literals_Operators;

public class Lab027_FinalKeyword {
    public static void main(String[] args) {
        //Area of the circle example
        byte a = 15; //we cannot use variable name unless we assign some value to it
        // it will throw error
        final float pi = 3.14f;
        // pi = 3.13; cannot be changed
        System.out.println("Radius of a Circle is "+ a);
        float b = (pi*a*a);
        System.out.println("Area of the Circle would be "+b);
    }
}
