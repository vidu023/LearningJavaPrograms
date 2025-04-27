package ex_32_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab243_NestedArrayList {
    public static void main(String[] args) {

        // List #1
        List fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("chickoo");
        System.out.println(fruits);

        // List #2
        List veggies = new ArrayList<>();
        veggies.add("tomato");
        veggies.add("potato");
        veggies.add("cucumber");
        veggies.add("onion");
        System.out.println(veggies);

        //List #3
        List makeup = new ArrayList<>();
        makeup.add("lipstick");
        makeup.add("blusher");
        makeup.add("kajal");
        makeup.add("compact");
        makeup.add("eye shadow");
        System.out.println(makeup);

        // List within List is also possible
        List allItems = new ArrayList<>();
        allItems.add(fruits);
        allItems.add(veggies);
        allItems.add(makeup);
        System.out.println(allItems);
        System.out.println(allItems.get(2));
    }
}
