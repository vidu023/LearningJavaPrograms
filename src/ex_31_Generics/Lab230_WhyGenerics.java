package ex_31_Generics;

public class Lab230_WhyGenerics {
    public static void main(String[] args) {
        sum(15,28);
        sum(15.28,28.15);
        sum("Vidya","Kini");

        // we need to create separate functions for each data type else it will throw error

    }

    // we need to create 3 different functions with different parameters
    // method overloading
    // static because we don't want to create a object
    static int sum (int a, int b){
    return a+b;
    }

    static double sum (double a, double b){
    return a+b;
    }

    static String sum (String a, String b){
    return a+b;
    }
}


