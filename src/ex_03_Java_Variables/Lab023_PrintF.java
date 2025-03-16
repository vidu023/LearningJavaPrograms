package ex_03_Java_Variables;

public class Lab023_PrintF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("Your variable is %d",a);
        // %d -> int, byte, short, long data types
        // %s -> string
        // %f -> float & double
        // %b -> boolean

        //print f is just used for formatting
        // a value is replaced by 10 & then % d value is replaced by 10

        System.out.println();
        int b = 25;
        System.out.printf("%d + %d", a,b); //it is just replacing the value & printing that's it

    }
}
