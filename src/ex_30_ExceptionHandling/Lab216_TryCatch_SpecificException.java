package ex_30_ExceptionHandling;

public class Lab216_TryCatch_SpecificException {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
        } catch (ArithmeticException e)
                // mentioning a particular type of exception here
                // divide by 0 is not possible & will throw Arithmetic Exception
        {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
