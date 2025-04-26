package ex_30_ExceptionHandling.QA_HandlingE;

public class Lab221_TryCatch_SeniorQA_2 {
    public static void main(String[] args) {
         // Senior QA who has some knowledge about exception handing
        // will mention different Exception handling with Try Catch block - multiple catch blocks

        String z = null;

        // vulnerable code
        try {
            z = args[0];
            int age = Integer.parseInt(z);
            z.trim();
            int a = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
             System.out.println(e.getMessage());
         }
     }
}
