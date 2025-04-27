package ex_32_CollectionFramework_DSA.LIST;

import java.util.ListIterator;
import java.util.Vector;

public class Lab242_Vector_ListIterator {

    public static void main(String[] args) {

        Vector<String> items = new Vector<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");
        items.add("Item 5");

        System.out.println(items);

        ListIterator list_i = items.listIterator();

        System.out.println("--------hasNext-------");
        while (list_i.hasNext()){
            System.out.println(list_i.next());
        }
        System.out.println("------hasPrevious----------");
        // hasPrevious works with hasNext to print the items
        while (list_i.hasPrevious()){
            System.out.println(list_i.previous());
        }
    }
}
