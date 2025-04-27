package ex_32_CollectionFramework_DSA.LIST;

import java.util.Stack;

public class Lab247_Stack {
    public static void main(String[] args) {

        // LIFO - Last in First Out
        Stack s = new Stack<>();
        // s.add("Pramod"); // add() function is there but we use push()
        s.push("Vidya");
        s.push("Vinitha");
        s.push("Kavita");
        s.push("Jaya");
        s.push("Megha");
        s.push("Sonali");
        s.push("Jaya"); // duplication allowed in Stack

        System.out.println(s);

        System.out.println(s.peek()); // peek() is just to see the last element inserted-> no change in the array
        System.out.println(s);

        System.out.println(s.pop()); // but pop() will remove the last element
        System.out.println(s);

        System.out.println(s.size()); // size of the stack
        System.out.println(s.isEmpty()); // its not empty
        System.out.println(s.add("Geeta")); // added so will return true
        System.out.println(s);

        s.add("Rupali");
        s.add("Manju");
        s.push("Snehal");
        System.out.println(s);
    }
}
