package ex_07_IncrementDecremet;

public class Lab073_PostPreIncrement_Ex1 {
    public static void main (String[] args){

        int a = 10;
        System.out.println( a++ + ++a);
        System.out.println(a);

        // a++ -> print first & increment later
        // ++a -> increment first & then print

        // A + B
        // A -> a++ -> ExpressionValue -> 10 and a value will increase to 11 after the increment
        // B -> a++ -> ExpressionValue -> 12 i.e. increased and now the value of a is 12
        // output -> 10 + 12 -> 22

        //Exp & Result Table
        //Line No | a | Result (A + B) -> (a++ + ++a)
        // 6      | 10 | NA
        // 7      | 11 | 10 + 12 -> 22
        // 8      | 12 | NA

    }
}
