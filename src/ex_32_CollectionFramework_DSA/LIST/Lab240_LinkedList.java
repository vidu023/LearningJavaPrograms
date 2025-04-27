package ex_32_CollectionFramework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab240_LinkedList {
    public static void main(String[] args) {
        List sample = new LinkedList();
        sample.add("vidya");
        sample.add("megha");
        sample.add("vinitha");
        sample.add("jaya");
        sample.add("radha");
        sample.add(null); //can store null value
        sample.add(true);
        sample.add(1234);
        sample.add("kavita");
        sample.add("radha"); // can store duplicates

        System.out.println(sample);
        System.out.println(sample.size());
        System.out.println(sample.contains("jaya"));
        System.out.println(sample.indexOf("kavita"));
    }
}
