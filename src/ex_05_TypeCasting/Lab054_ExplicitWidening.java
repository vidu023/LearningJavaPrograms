package ex_05_TypeCasting;

public class Lab054_ExplicitWidening {
    public static void main(String[] args) {

        // Explicit Casting in case of Widening
        byte b = 30;
        int a = (int)b; // we have explicitly mentioned the data type
        //but its not required

        System.out.println(a);
    }
}
