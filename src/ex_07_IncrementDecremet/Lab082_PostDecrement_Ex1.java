package ex_07_IncrementDecremet;

public class Lab082_PostDecrement_Ex1 {
    public static void main(String[] args) {
        // Post Decrement Example
        //a-- -> a value is decremented by 1

        int a = 10;
        int b = a--; // here the value of a is printed first then decremented by 1
        // 10 -> b and then value is decremented so a is now 9

        System.out.println(a); // a value is decremented to 1 -> so its 9
        System.out.println(b); // b gets value of a which is 10

        //Exp & Result Table
        //Line No | a | Result b
        // 8     | 10 | NA
        // 9     | 9 | 9
        // 13    | 9 | 9 (not printing this)
        // 14    | 9 (not printing this) | 9
    }
}
