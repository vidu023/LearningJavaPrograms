package ex_32_CollectionFramework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab256_HashMap {
    public static void main(String[] args) {
        // HashMap -> Order is not maintained here
        // key should be unique

        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2); // latest same key with different value is allowed (replacement is done)
        map.put("id2",11);
        map.put("id5",96);
        map.put("id3",null); // null values with different keys are allowed
        map.put("id4",47);
        map.put("id6",null);
        map.put(null,72); // only 1st key as null is allowed

        System.out.println(map);
        // Output - {null=72, id2=11, id4=47, id3=null, id6=null, id=2, id5=96}

        System.out.println(map.size()); //7
        System.out.println(map.isEmpty()); //false
        System.out.println(map.containsKey("id2")); //true
        System.out.println(map.containsValue(33)); //false

        // all the keys using keySet()
        System.out.println(map.keySet()); // [null, id2, id4, id3, id6, id, id5]

        // all the values
        System.out.println(map.values()); // [72, 11, 47, null, null, 2, 96]

        // you can get thew value of a key by using get()
        System.out.println(map.get("id5")); //96
    }
}
