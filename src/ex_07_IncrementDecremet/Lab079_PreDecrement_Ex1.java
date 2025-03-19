package ex_07_IncrementDecremet;

public class Lab079_PreDecrement_Ex1 {
    public static void main(String[] args) {
        // Pre Decrement Example
        //--a -> a value is decremented by 1

        int a = 10;
        int b = --a; // here the value of a is decremented by 1 first and then printed
        // 10 - 1 -> b -> 9

        System.out.println(a); // a value is decremented to 1 -> so its 9
        System.out.println(b); // b gets decremented value of a which is 9

        //Exp & Result Table
        //Line No | a | Result b
        // 8     | 10 | NA
        // 9     | 9 | 9
        // 13    | 9 | 9 (not printing this)
        // 14    | 9 (not printing this) | 9
    }
}
