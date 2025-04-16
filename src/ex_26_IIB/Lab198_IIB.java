package ex_26_IIB;

public class Lab198_IIB {
    // IIB -> Instance Initialization Block
    // rarely used
    public static void main(String[] args) {
        A a = new A();
        //automatically calls the functions when an object is created
        // first ones to be called but both IIB & Constructor will be called

        // if object is not created IIB's will not be called
        // it will be called before the constructor is called
        // A b // will not be called
        new A(); // it will be called -> Object creation
    }
}

class A{
    A(){
        System.out.println("I am a Default Constructor");
    }
    {
        System.out.println("Hi I am called during object creation");
        // I can print / call n number of functions during object creation/ instance creation
        // mysql connection
        // read csv, xls files
        // read json, xml file
        // read a text file or env file
        // open a website before web automation / api automation

        // it looks like a constructor but not a constructor
        // you can have unlimited number of iibs but constructor can be only 1
    }
}