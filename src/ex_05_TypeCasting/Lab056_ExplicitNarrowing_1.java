package ex_05_TypeCasting;

public class Lab056_ExplicitNarrowing_1 {
    public static void main(String[] args) {

        // Explicit Casting in case of Narrowing
        // only this is allowed
        // data loss will occur in this case

        // number will be converted into binary number
        //and from that binary number only 8 bits will be taken
        // then convert into decimal number.

        int a = 300;
        byte b = (byte) a; // only this type of casting is allowed -> narrowing

        System.out.println(b);
    }
}
