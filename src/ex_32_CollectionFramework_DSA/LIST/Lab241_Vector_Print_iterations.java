package ex_32_CollectionFramework_DSA.LIST;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Lab241_Vector_Print_iterations {
    public static void main(String[] args) {

        List vegetables = new Vector();
        List veggies = new Vector(10); // capacity can be given -> length of the array

        vegetables.add("potato");
        vegetables.add("onion");
        vegetables.add("tomato");
        vegetables.add("beetroot");
        vegetables.add("cucumber");
        vegetables.add("capsicum");
        vegetables.add("cabbage");
        vegetables.add("cauliflower");
        vegetables.add("peas");
        vegetables.add("carrot");
        vegetables.add("spinach");
        //vegetables.add("cauliflower"); // duplicates allowed

        System.out.println(vegetables);
        vegetables.remove("spinach"); // function
        System.out.println(vegetables.contains("cauliflower"));
        System.out.println("After removal: " + vegetables);
        System.out.println(vegetables.size());

        System.out.println("using Enhanced for loo");

        // enhanced for loop
        for (Object v : vegetables) {
            // it can contain different data type also its mentioned object
            System.out.println(v);
        }

        System.out.println("using normal for each loop");

        // normal for loop
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.println(vegetables.get(i));
        }

        System.out.println("using Iterator");

        // use of iterator
        // this is more popular & available in the list, set , queue
        Iterator i = vegetables.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("using Enumeration");

        // using enumeration
        /*
        Enumeration<Object> e = vegetables.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        */

        System.out.println("using List Iterator");

        ListIterator li = vegetables.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        // ListIterator is popular also because it can print the array in backward direction as well
        // using hasPrevious()
        System.out.println("Printing in backward direction using ListIterator -> hasPrevious()");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

        // why are we using v. functions & not creating instance of the object
        // because iterator is present in the List
        // your references of the vector contains Iterator, Enumeration, ListIterator so need to create an instance of it
    }
}
