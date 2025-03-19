package ex_07_IncrementDecremet;

public class Lab068_PreIncrement_Ex1 {
    public static void main(String[] args) {
        // Pre Increment Example
        //++a -> a value is incremented by 1

        int a = 10;
        int b = ++a; // here the value of a is incremented by 1 first and then printed
        // 10 + 1 -> b -> 11

        System.out.println(a); // a value is incremented to 1 -> so its 11
        System.out.println(b); // b gets incremented value of a which is 11

        //Exp & Result Table
        //Line No | a | Result b
        // 8     | 10 | NA
        // 9     | 11 | 11
        // 11    | 11 | 11 (not printing this)
        // 12    | 11 (not printing this) | 11

    }
}
