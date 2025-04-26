package ex_30_ExceptionHandling.QA_HandlingE;

public class Lab222_TryCatch_ExpertQA {
    public static void main(String[] args) {
         // Senior QA who has some knowledge about exception handing
        // will mention different Exception handling with 1 Try Catch block - using OR statement

        String z = null;

        // vulnerable code
        try {
            z = args[0];
            int age = Integer.parseInt(z);
            z.trim();
            int a = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException| NumberFormatException| NullPointerException| ArithmeticException e) {
            System.out.println(e.getMessage());
        }
     }
}
