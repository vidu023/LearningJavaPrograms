package ex_32_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab245_AL_Sort_ReverseOrder {
    public static void main(String[] args) {

        List marks = new ArrayList<>();
        marks.add(92);
        marks.add(85);
        marks.add(95);
        marks.add(90);
        marks.add(81);

        System.out.println(marks); //without sorted
        Collections.sort(marks);
        System.out.println(marks); //marks sorted using Collections.sort() function

        Collections.sort(marks, Collections.reverseOrder()); // sorting marks in reverse order of the above sort
        System.out.println(marks);

        // only Collection -> Interface
        // Collections with s is a Class


    }
}
