package ex_30_ExceptionHandling;

public class Lab213_NullPointerException {
    public static void main(String[] args) {
         String name = null;
         name.trim(); // cannot trim null value
        // NullPointerException
    }
}
