package ex_07_IncrementDecremet;

public class Lab074_PreIncrement_Ex3 {
    public static void main (String[] args){

        int a = 10;
        int result = ++a + ++a;

        System.out.println(result);
        System.out.println(a);

        // ++a -> increment first & then print

        // result -> A + B
        // A -> ++a -> ExpressionValue -> 11 i.e. increased and now the value of a is 11
        // B -> ++a -> ExpressionValue -> 12 i.e. increased and now the value of a is 12
        // output -> 11 + 12 -> 23

        //Exp & Result Table
        //Line No | a | Result (A + B) -> (a++ + ++a)
        // 6      | 10 | NA
        // 7      | 11 | 11 + 12 -> 23
        // 8      | 12 | NA
    }
}
