package ex_32_CollectionFramework_DSA.SET;

import java.util.*;

public class Lab249_SET_HS_LHS_TS {

    // difference between HashSet, LinkedHashSet & TreeSet
    public static void main(String[] args) {

        // HashSet
        Set <String> hs = new HashSet();
        // uses hashing mechanism to store elements
        // no order is maintained
        // no duplicates are allowed

        System.out.println("--------------HashSet-------------");

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Mango");
        hs.add("Grapes");
        hs.add("Watermelon"); // duplicate
        // hs.add(12345) // only String
        hs.add(null); // only one null is allowed

        System.out.println(hs);
        // Output - [Apple, Grapes, Watermelon, Mango, Orange]

        // enhanced for loop
        for (String s : hs){
            System.out.println(s);
        }

        // Iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Linked HashSet
        Set lhs = new LinkedHashSet();
        // Linked list mechanism to store elements
        // order will be maintained
        // again no duplicates are allowed

        System.out.println("--------------LinkedHashSet-------------");

        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Apple");
        lhs.add("Mango");
        lhs.add("Papaya");
        lhs.add("Banana");
        lhs.add("Grapes");

        System.out.println(lhs);
        // Output - [Orange, Watermelon, Apple, Mango, Papaya, Banana, Grapes]
        System.out.println(lhs.size());
        System.out.println(lhs.contains("Banana"));

        // TreeSet
        Set ts = new TreeSet();
        // black & red tree mechanism to store elements
        // order will be maintained, Natural Sorting is done (alphabetically using 1st alphabet)
        // no duplicates are allowed
        // natural sorting - ASCII values Eg "Apple" comes 1st than "apple"

        System.out.println("--------------TreeSet--------------");

        ts.add("Banana");
        ts.add("Apple");
        ts.add("Muskmelon");
        ts.add("Chikoo");
        ts.add("Mango");
        ts.add("Grapes");
        ts.add("Papaya");
        ts.add("Watermelon");

        // Integer & String are both different
        // ts.add(123); // cannot add - ClassCastException

        // if null added won't be able to sort
        // ts.add(null); // null cannot be added - NullPointerException

        // if no String is there i.e. blank then it shall be the 1st one to get added
        // ts.add(" ");

        System.out.println(ts);
        // Output - [Apple, Banana, Chikoo, Grapes, Mango, Muskmelon, Papaya, Watermelon]

        // apple (lowercase apple will be added in the last due to ASCII
        ts.add("apple");
        System.out.println(ts);
        // Output - [Apple, Banana, Chikoo, Grapes, Mango, Muskmelon, Papaya, Watermelon, apple]

        // Enhanced For loop
        for (Object t : ts){
            System.out.println(t);
        }
    }
}
