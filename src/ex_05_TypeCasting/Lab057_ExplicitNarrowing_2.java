package ex_05_TypeCasting;

public class Lab057_ExplicitNarrowing_2 {
    public static void main(String[] args) {

        //Explicit Casting -> Narrowing
        long ph_number = 9876543210l;
        short number = (short) ph_number; // narrowing
        //short number = ph_number; // this is not allowed

        System.out.println(number);
    }
}
