package ex_16_Arrays;

import java.util.Scanner;

public class Lab165_TwoDim_MatrixMultiplication {
    public static void main(String[] args) {
        // Matrix Multiplication

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for printing Matrix Multiplication: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
               // System.out.print(i*j + "  "); // this showcases only the value
                System.out.print(i + " x " + j +" = " + (i*j) + "\t\t");
            }
            System.out.println();
        }
    }
}
