package ex_16_Arrays;

import java.util.Scanner;

public class Lab166_TwoDim_LeftTriangle {
    public static void main(String[] args) {
        // Left Triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to see Left Triangle Pattern: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) { // it will start from reverse -> 3,2,1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
