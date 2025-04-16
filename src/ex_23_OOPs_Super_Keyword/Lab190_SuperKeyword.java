package ex_23_OOPs_Super_Keyword;

public class Lab190_SuperKeyword {

    // Super Keyword -> is able to access the variables, methods & constructors
}

class Vehicle{
    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("I am Default Constructor");
    }

    Vehicle(String name){
        System.out.println("Parameterized Constructor");
    }

    void message(){
        System.out.println("Method Overloading, Same name function - No arguments passed");
    }

    void message(int year){
        System.out.println("Method Overloading, Same name function - arguments passed");
    }

    void display(){
        System.out.println("This is a new Vehicle");
    }
}

class Car extends Vehicle{

    private int maxSpeed = 281;

    Car(){
        super(); // Default Constructor of parent will be called
    }

    Car(String name){
        super("Hyundai"); // Parameterized Constructor of parent will be called
    }

    @Override
    void display(){

        System.out.println(this.maxSpeed); // this class -> Car Maxspeed

        //Parent class attributes & Methods are called
        System.out.println(super.maxSpeed); // super class -> Vehicle Maxspeed
        super.message();
        super.message(2022);
        super.display();

        System.out.println("Over ride function");
    }

}