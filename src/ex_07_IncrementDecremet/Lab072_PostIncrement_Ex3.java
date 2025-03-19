package ex_07_IncrementDecremet;

public class Lab072_PostIncrement_Ex3 {
    public static void main (String[] args) {
        // Post Increment Example 2

        int age = 25;
        int new_age = age++;

        System.out.println(age);
        System.out.println(new_age);

        //Exp & Result Table
        //Line No | age | Result new_age
        // 7     | 25 | NA
        // 8     | 26 | 25
        // 10    | 26 | NP
        // 11    | NP | 25

    }

}
