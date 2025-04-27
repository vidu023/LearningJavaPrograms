package ex_32_CollectionFramework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab248_Set_Eg {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set lh = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Vidya");
        hs.add("Vidya");
        hs.add("Kini");

        System.out.println(hs);
        // only one Vidya will be stored
        // duplication not allowed in SET

        // Set es = new EnumSet(); //rarely used


    }
}
