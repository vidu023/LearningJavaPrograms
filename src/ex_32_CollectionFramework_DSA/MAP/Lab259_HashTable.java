package ex_32_CollectionFramework_DSA.MAP;

import ex_01_Java_Intro.HelloWorld;

import java.util.Enumeration;
import java.util.Hashtable;

public interface Lab259_HashTable {
    public static void main(String[] args) {
        // Map -> Key, Value & allows null values

        // Hashtable -> Synchronized (Thread safe), Slow & is a Legacy class
        // T1, T2 will be used one by one
        Hashtable <Integer, String> ht = new Hashtable();
        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
        //ht.put(4, null); // if we add null it will throw error -> NullPointerException
        //ht.put(null, "four"); // even key as null is also not allowed
        // duplicates will be replaced with new values

        System.out.println(ht); // Output - {3=three, 2=two, 1=one}

        System.out.println("---------------------");

        Enumeration <Integer> e1 = ht.keys();
        while (e1.hasMoreElements()){
            System.out.println(e1.nextElement()); // only values will be printed
        }

    }
}
