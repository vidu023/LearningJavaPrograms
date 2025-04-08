package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Father extends Grandfather{
    int gold = 5000;
    void house(){
        System.out.println("Father's 3 BHK");
    }

    // Common method across all classes
    // For Dynamic dispatch
    void land(){
        System.out.println("Ancestor Property Land - Father's access");
    }
}
