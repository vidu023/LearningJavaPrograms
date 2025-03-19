package ex_07_IncrementDecremet;

public class Lab071_PostIncrement_Ex2 {
    public static void main (String[] args){

        int a = 20;
        System.out.println(a++ + a);

        // A + B
        // A -> a++ -> ExpressionValue -> 10 and a value will increase to 11 after the increment
        // B -> a -> ExpressionValue -> 11 and a value is 11

        //Exp & Result Table
        //Line No | a | Result a++
        // 6     | 20 | NA
        // 7     | 21 | 20          // 7 | 21 | 20 + 21 -> 41
        // output will be 20 + 21 -> 41

    }
}
