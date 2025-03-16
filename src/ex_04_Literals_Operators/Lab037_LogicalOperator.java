package ex_04_Literals_Operators;

public class Lab037_LogicalOperator
{
    public static void main(String[] args) {

        int salary = 75500;
        boolean b = true;

        System.out.println(!b); // !b -> not of true
        System.out.println(!!b); //!!b -> (not of (not of true)) i.e true

        boolean c = true || false; // || -> OR Gate -> NAND
        System.out.println(c);

        // Logical OR Gate is true if any one is true

        // Truth table for Logical OR Gate
        // false or false -> false
        // false or true -> true
        // true or false -> true
        // true or true -> true

        boolean e = false && false; // || -> AND Gate
        System.out.println(e);

          // Logical AND Gate will return true if both are true

        // Truth table for Logical AND Gate
        // false or false -> false
        // false or true -> false
        // true or false -> false
        // true or true -> true
    }
}
