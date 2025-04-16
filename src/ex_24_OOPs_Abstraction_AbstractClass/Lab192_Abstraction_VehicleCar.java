package ex_24_OOPs_Abstraction_AbstractClass;

public class Lab192_Abstraction_VehicleCar {
}

abstract class Vehicle{

    abstract void StartEngine();
    abstract void StopEngine();
}

class  WagonR extends Vehicle{


    @Override
    void StartEngine() {
        System.out.println("Starts the engine");
    }

    @Override
    void StopEngine() {

        System.out.println("Stops the engine");

    }
}