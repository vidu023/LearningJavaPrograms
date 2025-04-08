package ex_18_OOPs_Constructor;

public class Lab174_OOPs_ParameterizedConstructor {
    public static void main(String[] args) {

        Car2 car1 = new Car2(); // No parameters are passed during object creation

        // we want to create different objects
        // we can pass the names i.e. values during object creation
        // so parameterized constructor is called this time
        Car2 car2 = new Car2("Tesla","Model 3", 2015);
        System.out.println(car2.name);

        Car2 car3 = new Car2("Mahindra","Scorpio", 2020);
        System.out.println(car3.name);

        Car2 car4 = new Car2("Curvv","TATA", 2024);
        System.out.println(car4.name);
    }
}

class Car2{
    String name; // default value of String is null
    int year; // default value is 0 for int
    String model;

    // DC
    Car2(){
        // default values are set
        name = "Unknown Car Name";
        year = 0000;
        model = "Unknown Car Model";
    }

    // Parameterized Constructor
    // Arguments are passed
    Car2(String name_pc, String model_pc, int year_pc){

        /* so for car2 ->
        Car2("Tesla","Model 3", 2015){
        this.name = "Tesla";
        this.model = "Model 3";
        this.year = 2015; */


        // so for car2 object -> car2.name = name is this.name & so on
        // for another object car3 -> car3.name = name i.e. this.name
        // 'this' refers to the reference of the current object
        // so 'this' changes based on the reference called
        // i.e. this.name for car2 is different & for car3 is different
        // this.name -> String name
        this.name = name_pc; // = name_pc value comes from parameterized constructor
        this.model = model_pc;
        this.year = year_pc;

    }
}