package ex_20_OOPs_Polymorphism.Method_Overloading;

public class Lab184_SubtractionOperations {

    public int subtract(int a, int b){
        return a-b;
    }

    public int subtract(int a, int b,int c){
        return a-b-c;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public static void main(String[] args) {

        Lab184_SubtractionOperations op = new Lab184_SubtractionOperations();
        int re1 = op.subtract(91,45);
        int re2 = op.subtract(2456,120,262);
        double re3 = op.subtract(753.14,45.89);

        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re3);

    }
}
