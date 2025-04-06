package ex__18_OOPs_Constructor;

public class Lab171_OOPs_DefaultConstructor {
    public static void main(String[] args) {

        Baby b1 = new Baby(); // Object creation -> Default Baby Constructor is called
        new Baby(); // Object without Reference -> Still Default Baby Constructor is called
        // it will be called twice

        Baby b2; // no Object creation only Reference -> Constructor is not called

    }
}

class Baby{

    // Attributes
    String name;
    String age;

    // Behaviour
    void cry(){
        System.out.println("I am crying");
    }
    void sleep(){
        System.out.println("I am sleeping");
    }
    void eat(){
        System.out.println("I am eating");
    }

    // Default Constructor
    // It will be automatically called only once during Object creation
    Baby(){
    System.out.println("I am Default Constructor");
    // I can write certain line of code like
    // Fetch data from some SQL/ CSV File -> automatically this file will be called
    // Open & Read a file Eg Excel, JSON etc
}

}

