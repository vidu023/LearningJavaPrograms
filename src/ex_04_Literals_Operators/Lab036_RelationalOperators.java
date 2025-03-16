package ex_04_Literals_Operators;

public class Lab036_RelationalOperators
{
    public static void main(String[] args) {

        //Relational Operators

        // < Less than
        // < = -> Less than or equal to
        // > Greater than
        // > = -> Greater than or equal to
        // == -> Equal to (will check)
        // != -> Not equal to

        //All of the Relational Operators will be in boolean only

        byte a = 46;
        byte b = 40;
        byte c = 46;

        boolean result1 = a>b;
        boolean result2 = a<=b; // a is less than or equal to b? -> check both less & equal then return
        boolean result3 = a==c;

        System.out.println(result1); // 46>40
        System.out.println(result2); //46<=40
        System.out.println(result3); //46==46

    }
}
