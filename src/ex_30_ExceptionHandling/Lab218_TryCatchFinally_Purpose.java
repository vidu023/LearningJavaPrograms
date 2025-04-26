package ex_30_ExceptionHandling;

import java.util.Scanner;

public class Lab218_TryCatchFinally_Purpose {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);

        int a = sc.nextInt();
        try {
            int div = a/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            // some important tasks to be done anyways even if try/ catch block is not executed
            System.out.println("scanner closed");
        }

    }
}
