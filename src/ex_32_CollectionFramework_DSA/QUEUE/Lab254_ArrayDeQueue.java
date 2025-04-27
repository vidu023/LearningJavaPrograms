package ex_32_CollectionFramework_DSA.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab254_ArrayDeQueue {
    public static void main(String[] args) {

        Deque <Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(63);
        deck.push(29);
        deck.push(5);

        System.out.println(deck); // natural sorting happens
        // Output - [5, 29, 63, 15]
    }
}
