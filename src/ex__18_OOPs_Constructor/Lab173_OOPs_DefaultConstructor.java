package ex__18_OOPs_Constructor;

public class Lab173_OOPs_DefaultConstructor {
    public static void main(String[] args) {

        Car c1 = new Car();
        // if default values are not set then Java assigns default values as null & 0

        // if car name is set then it will print the car name
        // & for rest it will print the default values which are set in the constructor
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("------------");

        Car c2 = new Car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
    }
}

class Car{
    String name; // default value of String is null
    int year; // default value is 0 for int
    String model;

    //DC
    // by using the default constructor every object will have the same value/ attributes
    // because they are calling the same default constructor
    Car(){
        // default values are set
        name = "Unknown Car name";
        year = 000;
        model = "Unknown Car Model";
    }
}