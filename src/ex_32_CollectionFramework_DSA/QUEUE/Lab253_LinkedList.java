package ex_32_CollectionFramework_DSA.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab253_LinkedList {
    public static void main(String[] args) {

        Queue <Integer> q = new LinkedList();
        q.add(67);
        q.add(82);
        q.add(44);
        q.add(78);

        // printing using Iterator interface
        Iterator <Integer> iterator = q.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
