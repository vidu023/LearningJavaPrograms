package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Grandfather {
    double cash = 5000000;
    void bungalow(){
        System.out.println("Grandfather's Bungalow");
    }

    // Common method across all classes
    // For Dynamic dispatch
    void land(){
        System.out.println("Ancestor Property Land - Grandfather's access");
    }
}
