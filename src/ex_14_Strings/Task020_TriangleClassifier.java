package ex_14_Strings;

import java.util.Scanner;

public class Task020_TriangleClassifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle: ");

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        // Edge Cases should be given

        // to check if sides are not 0
        if((side1 <=0) || (side2 <= 0) || (side3 <= 0)){
            System.out.println("This is not a Triangle");
            System.exit(0); // exit from the code
        }

        // addition of 2 sides cannot be equal to 3rd side
        if ((side1 + side2 <= side3)|| (side2 + side3 <= side1)|| (side3 + side1 <= side2)){
            System.out.println("This is not a Triangle");
            System.exit(0);
        }

        //Real logic
        if ((side1 == side2) && (side2 == side3)){
            System.out.println("This is an Equilateral Triangle");
        } else if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
            System.out.println("This is an Isosceles Triangle");
        }
        else {
            System.out.println("This is a Scalene Triangle");
        }
    }
}
