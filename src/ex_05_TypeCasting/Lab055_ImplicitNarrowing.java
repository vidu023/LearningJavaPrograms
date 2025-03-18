package ex_05_TypeCasting;

public class Lab055_ImplicitNarrowing {
    public static void main(String[] args) {

        //Implicit Type of Casting in case of Narrowing
        // it is not allowed in case of narrowing
        // data loss is there
        // overflow

        int a = 125;
        //byte b = a; // this statement throws an error

        //System.out.println(b);
        // Error thrown - java: incompatible types: possible lossy conversion from int to byte

    }
}
