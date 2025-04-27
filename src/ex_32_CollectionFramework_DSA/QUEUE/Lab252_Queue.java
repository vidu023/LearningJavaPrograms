package ex_32_CollectionFramework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab252_Queue {
    public static void main(String[] args) {
        // Queue -> 0.001% is used in Automation

        PriorityQueue pq = new PriorityQueue();
        pq.add("Vidya");
        pq.add("Sandhya");
        pq.add("Komal");
        pq.add("Vijaya");
        pq.add("Harsha");

        //FIFO manner & Natural Sorting automatically i.e. based on the 1st alphabet
        System.out.println(pq);
        // Output - [Harsha, Komal, Sandhya, Vijaya, Vidya]

        System.out.println(pq.peek()); // Harsha i.e. 1st element view
        System.out.println(pq.poll()); // Harsha i.e 1st element is removed
        System.out.println(pq); // Output - [Komal, Vidya, Sandhya, Vijaya] after poll()
    }
}
