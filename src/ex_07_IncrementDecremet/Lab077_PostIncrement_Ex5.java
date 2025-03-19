package ex_07_IncrementDecremet;

public class Lab077_PostIncrement_Ex5 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println( a++ + a++);
        System.out.println(a);

        // a++ -> print first & increment later

        // A + B
        // A -> a++ -> ExpressionValue -> 10 and a value will increase to 11 after the increment
        // B -> a++ -> ExpressionValue -> 11 and a value will increase to 12 after the increment
        // output -> 10 + 11 -> 21

        //Exp & Result Table
        //Line No | a | Result (A + B) -> (a++ + a++)
        // 6      | 10 | NA
        // 7      | 11 | 10 + 11 -> 21
        // 8      | 12 | NA

    }
}
