package ex_30_ExceptionHandling;

public class Lab215_TryCatch_IQ_1 {
    public static void main(String[] args) {

        try {
            String name = null;
            name.trim(); // nullpointer exception
            int a = 10/0; // arithmetic exception
        } catch (NullPointerException | ArithmeticException e)
        {
            // Null Pointer or Arithmetic

            //new ArithmeticException() // JVM is creating an object internally ->inbuilt function
            System.out.println(e.getMessage());
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
