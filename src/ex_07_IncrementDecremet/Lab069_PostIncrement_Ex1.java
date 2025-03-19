package ex_07_IncrementDecremet;

public class Lab069_PostIncrement_Ex1 {
    public static void main(String[] args) {
        // Post Increment Example
        // a++ means value is increment by 1

        int a = 30;
        //int b = a++; // value is printed first & then incremented by 1

        //System.out.println(a);
        //System.out.println(b);

        //Exp & Result Table
        //Line No | a | Result b
        // 8     | 10 | NA
        // 9     | 11 | 10
        // 11    | 11 | 10 (not printing this)
        // 12    | 11 (not printing this) | 10

        System.out.println(a++); // a value is printed as it is & then incremented
        // print a value -> 10 -> then increment 10 +1 -> now a = 11
        System.out.println(a); // it will print the incremented value of a here
    }



}
