package ex_30_ExceptionHandling;

import java.io.OutputStream;

public class Lab224_TryCatch_IQ_2 {
    public static void main(String[] args) {
        int a = 0;
        try {
            int x = 10/a;
        }catch (Exception e){
            System.out.println("Divide by 0 is not possible");
        }finally {
            System.out.println("I will be executed anyways");
        }
    }
}

/*
Output
Divide by 0 is not possible
I will be executed anyways
*/
