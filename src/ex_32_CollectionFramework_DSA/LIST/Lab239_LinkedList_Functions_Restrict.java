package ex_32_CollectionFramework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab239_LinkedList_Functions_Restrict {
    public static void main(String[] args) {

        List <String> animals = new LinkedList(); // only String type of data is inserted -> Restrict -> Generic
        animals.add("dog");
        animals.add("cat");
        animals.add("monkey");
        animals.add("lion");
        animals.addFirst("tiger"); //pre made functions which we can use
        animals.addLast("elephant");
        animals.add("donkey");

        // Accessing elements
        System.out.println(animals);
        System.out.println("First animal is: "+ animals.getFirst());
        System.out.println("Last animal is: "+ animals.getLast());

        //Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("Animal list after removal is: "+ animals);
        System.out.println("Size of animal list is: "+ animals.size());
    }
}
