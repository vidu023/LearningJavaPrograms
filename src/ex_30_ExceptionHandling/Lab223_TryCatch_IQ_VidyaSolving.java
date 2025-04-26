package ex_30_ExceptionHandling;

import java.util.Scanner;

public class Lab223_TryCatch_IQ_VidyaSolving {
    public static void main(String[] args) {
        double pi = 3.14;
        System.out.println("Enter a number: ");
        int radius = 0;
        try {
            Scanner sc = new Scanner(System.in);
            radius = sc.nextInt();
        } catch (ArrayIndexOutOfBoundsException| NumberFormatException e) {
            System.out.println("Radius cant be 0");
        }
        double area = (pi * radius * radius);
        System.out.println("Area of a Circle whose radius = "+radius+ " is "+area);
    }


}
