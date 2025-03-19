package ex_07_IncrementDecremet;

public class Lab081_PreDecrement_Ex2 {
    public static void main(String[] args) {

        int a = 10;
        int result = (--a - a);

        System.out.println(a);
        System.out.println(result);


        //Exp & Result Table
        //Line No | a | Result result
        // 6     | 10 | NA
        // 7     | 9 | 9 - 9 -> 0
        // 9    | 9 | 9 (not printing this)
        // 10   | 9 (not printing this) | 9

    }
}
