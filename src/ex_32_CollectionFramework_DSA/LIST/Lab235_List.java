package ex_32_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab235_List {
    public static void main(String[] args) {

        // Object reference of Interface-> LIST is not possible
        // List temp = new List();

        // static method was introduced in Java 13 inside interfaces
        // so without creating objects it can be used directly -> List.of()
        // interface can have static functions i.e. complete functions
        // & without creating objects & reference we can call directly

        List fruits = List.of("orange", "apple", "banana" , "chickoo", "mango", "watermelon");
        System.out.println(fruits); // only view them -> println

        // but problem is we cannot add anything into it -> because static functions cannot be changed
        // in LIST Interface add is an incomplete -> abstract function

        //fruits.add("grapes"); // UnsupportedOperationException
        //fruits.remove("chickoo"); //again not possible

        // so we need to use Concrete class -> ArrayList, LinkedList, Stack, Vector to use the functions

        List l = new ArrayList(); // Dynamic Dispatch -> ArrayList implements List
        l.add(10);
        l.add(555.25);
        l.add("vidya");
        l.add(false);
        l.add("blah blah");

        System.out.println(l);

    }
}
