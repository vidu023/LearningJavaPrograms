package ex_07_IncrementDecremet.Tasks;

public class Task_004_IncrementOperator {
    public static void main(String[] args) {

        int a = 10;
        int result = (++a + a++ + a++);

        System.out.println(result);
        System.out.println(a);

        // a++ -> print first & increment later
        // ++a -> increment first & then print

        // A + B + C
        // A -> ++a -> ExpressionValue -> 11 i.e. increased and now the value of a is 11
        // B -> a++ -> ExpressionValue -> 11 and a value will increase to 12 after the increment
        // C -> a++ -> ExpressionValue -> 12 and a value will increase to 13 after the increment
        // output -> 11 + 11 + 12 -> 34

        //Exp & Result Table
        //Line No | a | Result (A + B + C) -> (++a + a++ + a++)
        // 6      | 10 | NA
        // 7      | 11 | 11 + 11 + 12 -> 34
        // 8      | 13 | NA

       /* Output
        34
        13  */
    }

}
