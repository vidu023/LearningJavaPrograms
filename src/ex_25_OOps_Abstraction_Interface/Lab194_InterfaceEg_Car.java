package ex_25_OOps_Abstraction_Interface;

public class Lab194_InterfaceEg_Car {
    public static void main(String[] args) {
        // Abstraction helps in hiding interfaces i.e. hidden from the main function
        Car1 c1 = new Car1();
        c1.drive();
    }
}

class Car1 implements Breaks, Engine1{
    //multiple inheritance is possible incase of interface

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Applying Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the Engine");
    }

    @Override
    public void test() {
        Engine1.super.test(); // Engine1 complete method is called
    }

}

interface Breaks{
    void applyBreak();
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void test(){
        System.out.println("Test function -> default");
    }
}