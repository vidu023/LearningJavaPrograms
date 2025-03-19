package ex_07_IncrementDecremet;

public class Lab075_PostIncrement_Ex4 {
    public static void main(String[] args) {
        int a = 10;
        int result = a++ + a++;

        System.out.println(result);
        System.out.println(a);

        // a++ -> print first & increment later

        // result -> A + B
        // A -> a++ -> ExpressionValue -> 10 and a value will increase to 11 after the increment
        // B -> a++ -> ExpressionValue -> 11 and a value will increase to 12 after the increment
        // output -> 10 + 11 -> 21

        //Exp & Result Table
        //Line No | a | Result (A + B) -> (a++ + ++a)
        // 6      | 10 | NA
        // 7      | 11 | 10 + 11 -> 21
        // 8      | 12 | NA
    }
}
