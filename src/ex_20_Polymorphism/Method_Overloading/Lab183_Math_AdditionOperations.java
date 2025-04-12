package ex_20_Polymorphism.Method_Overloading;

public class Lab183_Math_AdditionOperations {
    // Method Overloading
    // In the same class when you have a method with same name
    // but different arguments are passed & different return type

    public static void main(String[] args) {

        MathOperations m1 = new MathOperations();
        int r1 = m1.mathAdd(965,740);
        int r2 = m1.mathAdd(456,123,789);
        double r3 = m1.mathAdd(1234.56,789.65);

        System.out.println("Result r1: "+r1);
        System.out.println("Result r2: "+r2);
        System.out.println("Result r3: "+r3);
    }

static class MathOperations{
        // method name is same -> this is at class level
    int mathAdd(int a, int b){
        return a+b;
    }

    int mathAdd(int a, int b, int c){
        return a+b+c;
    }

    double mathAdd(double a, double b){
        return a+b;
    }

}

}
