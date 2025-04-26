package ex_30_ExceptionHandling;

public class Lab217_TryCatchFinally {
        public static void main(String[] args) {

        try {
            int a = 10/0; // arithmetic exception
        } catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }finally
        {
            // finally block is always be executed evn if it goes in try block or catch block
            // it will always be printed
            System.out.println("I will always be executed");
        }

    }
}
