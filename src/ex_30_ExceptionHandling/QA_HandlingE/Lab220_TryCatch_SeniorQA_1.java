package ex_30_ExceptionHandling.QA_HandlingE;

public class Lab220_TryCatch_SeniorQA_1 {
    public static void main(String[] args) {
         // Senior QA who has some knowledge about exception handing
        // will mention different Exception handling with Try Catch block

        // vulnerable code

        String z = null;

        //ArraysIndexOutofBound Exception
        try {
            z = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            int age = Integer.parseInt(z);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            z.trim();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
             int a = 10 / 0; // vulnerable code
         } catch (ArithmeticException e) {
             System.out.println(e.getMessage());
         }
     }
}
