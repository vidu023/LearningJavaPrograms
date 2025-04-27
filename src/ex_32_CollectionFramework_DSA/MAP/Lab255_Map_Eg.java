package ex_32_CollectionFramework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab255_Map_Eg {
    public static void main(String[] args) {
        // Map is key value pair
        // i.e name -> vidya

        // HashMap
        Map hm = new HashMap();
        // order is not maintained
        hm.put("name", "Kavita");
        hm.put("age", 28);
        hm.put("phoneNo", 912345678);

        System.out.println(hm);
        // Output - {name=Vidya, age=35, phoneNo=987654321}

        //LinkedHashMap
        Map lhm = new LinkedHashMap();
        // in case of LinkedHashMap -> order is maintained
        lhm.put("name", "Vidya");
        lhm.put("age", 35);
        lhm.put("phoneNo", 987654321);

        System.out.println(lhm);

        //TreeMap
        Map tm = new TreeMap();
        // in case of TreeMap -> natural sorting is done according to key i.e alphabetically
        tm.put("name", "Vidya");
        tm.put("age", 35);
        tm.put("college", "Mithibai");
        tm.put("phoneNo", 987654321);
        tm.put("address", "Mumbai");

        System.out.println(tm);
        // Output - {address=Mumbai, age=35, college=Mithibai, name=Vidya, phoneNo=987654321}
    }
}
