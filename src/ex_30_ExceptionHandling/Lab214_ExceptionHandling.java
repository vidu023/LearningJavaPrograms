package ex_30_ExceptionHandling;

public class Lab214_ExceptionHandling {
    // Exception Handling
    // Divide by 0 using Try catch block

    // if there is any vulnerable code JVM doesn't know how to handle it, it will drop
    // therefore we need to catch it
    // if we don't then user will face this error

    public static void main(String[] args) {
            int a = 0;
        int b = 0;
        try {
            b = 10/a;
            // vulnerable code which might throw exception will be inside try block
            // & catch will print friendly message
        } catch (Exception e) {
            //throw new RuntimeException(e);
            // Exception e takes the reference of the class object bucket
            // it's a big bucket in which there are many exceptions

            // here we know its Arithmetic exception
            System.out.println(e.getMessage()); //  / by zero -> this is the message
            // if there is problem in the code (try block) -> catch will be executed
        }

        // Multiple catch is possible
        // here it's not possible because Big Exception is used before
       /* catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }*/
        System.out.println(b);
    }



}
