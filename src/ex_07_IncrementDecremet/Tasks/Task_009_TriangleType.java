package ex_07_IncrementDecremet.Tasks;

import java.util.Scanner;

public class Task_009_TriangleType {
    public static void main(String[] args) {

        //To Check the type of the triangle
        // all 3 sides are equal -> Equilateral triangle
        // any 2 sides are equal -> Isosceles triangle
        // no sides are equal -> Scalene triangle
        // using if else statement to classify the triangle

        //taking inputs from the user using scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        System.out.println("Three sides of the triangle are: "+side1+", " +side2+" and "+side3);

        if ((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println ("Its an Equilateral Triangle");
        }else if((side1 == side2) || (side2 == side3) || (side1 == side3)){
            System.out.println("Its an Isosceles Triangle");
        }else{
            System.out.println("Its a Scalene Triangle");
        }





    }
}
