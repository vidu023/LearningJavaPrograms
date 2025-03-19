package ex_07_IncrementDecremet;

public class Lab080_PreIncrement_Ex5 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(++a + a);

        // A + B
        // A -> a++ -> ExpressionValue -> 21 i.e. increased and a value will be 21
        // B -> a -> ExpressionValue -> 21 and a value is 21

        //Exp & Result Table
        //Line No | a | Result a++
        // 6     | 20 | NA
        // 7     | 21 | 21          // 7 | 21 | 21 + 21 -> 42
        // output will be 21 + 21 -> 42

    }
}
