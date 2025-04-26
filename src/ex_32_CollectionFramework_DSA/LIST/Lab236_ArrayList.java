package ex_32_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab236_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("vidya");
        arrayList.add("vidya"); // duplicate is allowed in the LIST
        arrayList.add(123);
        arrayList.add(true);
        arrayList.add(963.74);
        arrayList.add(null); // null is also allowed
        arrayList.add("testing");

        System.out.println(arrayList);
        System.out.println(arrayList.size()); // size of the array
        System.out.println(arrayList.isEmpty()); // returns true if its empty -> here it returns false

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty()); // here it returns true
    }
}
