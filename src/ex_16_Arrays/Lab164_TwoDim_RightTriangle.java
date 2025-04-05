package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_TwoDim_RightTriangle {
    public static void main(String[] args) {
        // how do we need the pattern
        // say n = 3
        // *
        // **
        // ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for(int i = 0; i < num; i++){
            for(int j =0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
