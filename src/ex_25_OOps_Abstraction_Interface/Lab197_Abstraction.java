package ex_25_OOps_Abstraction_Interface;

public class Lab197_Abstraction {

}

class ConcreteClass implements IncompleteInterface{

    @Override
    public void display() {
        System.out.println("Hello this is Concrete class");
    }
}

interface IncompleteInterface{
    int a = 10; // here the value of a is final -> so its value cannot be changed
    void display(); // this is incomplete method
    // we cannot have complete functions in interface

    // only default & static are allowed after java 8
    default void display1(){
        System.out.println("I am default complete method in an interface");
    }

    static void display2(){
        System.out.println("I am static complete method in an interface");
    }

    //IncompleteInterface(){} // cannot have constructors
}

abstract class Incomplete_abstract{
    int b = 20; // here the value of b is not final -> so its value can be changed
    abstract void print();
    void output(){
        // we can have complete functions in abstract class
        System.out.println("Hello this is complete method of Abstract class");
    }
    Incomplete_abstract(){} // can have constructors
}