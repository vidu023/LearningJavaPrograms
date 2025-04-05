package ex_16_Arrays;

public class Lab151_Array_Predefined {
    public static void main (String[] args){
        // Predefined Array elements - Marks of a student

        int marks[] = {91,88,100,99,79,82,95};
        System.out.println(marks.length); // gives length of the array -> here it is 7
        System.out.println(marks[0]); // indexing starts from 0 -> 1st element
        System.out.println(marks[3]);
        System.out.println(marks[6]);

        // if i try to access the element outside the array it will give Array index out of bound Exception
        // java.lang.ArrayIndexOutOfBoundsException
        // System.out.println(marks[9]);
        // System.out.println(marks[-1]);

        // 2 nd way to create an array
        int [] score = new int[5]; // fixed size =-> java style declaration
        // int age[] = new int [7]; //another type of array declaration

        String[] name = new String[4];
        name[0] = "Vidya";
        name[1] = "Kavita";
        name[2] = "Latha";
        name[3] = "Radha";
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[0]);
        System.out.println(name[1]);
    }
}
