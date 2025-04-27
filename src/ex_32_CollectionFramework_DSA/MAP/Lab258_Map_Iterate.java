package ex_32_CollectionFramework_DSA.MAP;

import java.util.*;

public class Lab258_Map_Iterate {
    public static void main(String[] args) {
        // <String, Integer> Key as String & Value as Id

        Map<String, Integer> map_it = new HashMap();
        map_it.put("id1", 17);
        map_it.put("id2", 22);
        map_it.put("id3", 75);
        map_it.put("id4", 6);
        map_it.put("id5", 99);
        map_it.put("id6", 99);
        map_it.put("id7", 38);

        //print the values using iterator
        // iterator is bit different as Iterator is not available in Map

        // we have to remember this
        for (Map.Entry<String, Integer> item : map_it.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
