package ex_07_IncrementDecremet;

public class Lab076_PostPreIncrement_Ex2 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + a++);
        System.out.println(a);

        // a++ -> print first & increment later
        // ++a -> increment first & then print

        // A + B
        // A -> a++ -> ExpressionValue -> 11 i.e. increased and now the value of a is 11
        // B -> a++ -> ExpressionValue -> 11 and a value will increase to 12 after the increment
        // output -> 11 + 11 -> 22

        //Exp & Result Table
        //Line No | a | Result (A + B) -> (++a + a++)
        // 6      | 10 | NA
        // 7      | 11 | 11 + 11 -> 22
        // 8      | 12 | NA

    }
}
