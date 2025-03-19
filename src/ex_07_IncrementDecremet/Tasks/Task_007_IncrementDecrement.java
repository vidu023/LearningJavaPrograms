package ex_07_IncrementDecremet.Tasks;

public class Task_007_IncrementDecrement {
    public static void main(String[] args) {

        int a = 20;
        int result = (--a + a++ + a--);

        System.out.println(result);
        System.out.println(a);

        // a++ -> print first & increment later
        // --a -> decrement first & then print

        // A + B + C
        // A -> --a -> ExpressionValue -> 19 i.e. decreased and now the value of a is 19
        // B -> a++ -> ExpressionValue -> 19 and a value will increase to 20 after the increment
        // C -> a-- -> ExpressionValue -> 20 and a value will decrease to 19 after the decrement
        // output -> 19 + 19 + 20 -> 58

        //Exp & Result Table
        //Line No | a | Result (A + B + C) -> (--a + a++ + a--)
        // 6      | 20 | NA
        // 7      | 19 | 19 + 19 + 20 -> 58
        // 8      | 19 | NA

       /* Output
        58
        19*/

    }
}
