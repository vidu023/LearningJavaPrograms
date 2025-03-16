package ex_04_Literals_Operators;

public class Lab031_DataTypes {
    public static void main(String[] args) {

        // Primitive data type -> defined by the java
        //max & min size is defined for memory allocation
        int salary = 25000; // Byte 4 & 32 Bits
        byte age = 79; // Byte 1 & 8 Bits

        System.out.println(salary);
        System.out.println(age);

        //Non-Primitive Data types -> defined by the users
        //no size max & min
        // Byte - 8 * 64 bits -> memory space
        String name = "Vidya"; //string is a bunch of characters
        int[] arrays_items = new int[10];

        System.out.println(name);


    }
}
