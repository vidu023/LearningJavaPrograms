package ex_32_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab237_Restrict_GenericAL {
    public static void main(String[] args) {

        // if we restrict List to be Integer -> Generic then only int type data can be added. & null too
        List<Integer> arrayL = new ArrayList();
        // we can also give initial capacity of the array
        //List<Integer> arrayL = new ArrayList(5);

        // arrayL.add("1"); //incompatible types: java.lang.String cannot be converted to java.lang.Integer
        arrayL.add(1);
        arrayL.add(2);
        // arrayL.add("3");
        arrayL.add(3);
        arrayL.add(3);
        arrayL.add(null);
        // arrayL.add(false);

        System.out.println(arrayL); // array list is printed
        System.out.println(arrayL.size()); // size of the array
        System.out.println(arrayL.isEmpty()); // not true
        System.out.println(arrayL.contains(3)); // does it contain 3? T/F
        System.out.println(arrayL.indexOf(2)); // index of 2 is 1
        System.out.println(arrayL.lastIndexOf(3)); // duplicate -> last index of num

        System.out.println("------ using for loop-------");

        for (int i = 0; i < arrayL.size(); i++) {
            System.out.println(arrayL.get(i));
        }
    }
}
