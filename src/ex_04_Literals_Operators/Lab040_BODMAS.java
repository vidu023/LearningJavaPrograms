package ex_04_Literals_Operators;

public class Lab040_BODMAS {
    public static void main(String[] args) {

        // BODMAS Rule
        // Bracket -> Orders (Powers/ Indices/ Roots) -> Division -> Multiplication -> Addition -> Subtraction
        System.out.println((9*3/9+1)*3);

        // 9 * 3 = 27
        // 27 / 9 = 3
        // 3 + 1 = 4
        // 4 * 3 = 12
    }
}
