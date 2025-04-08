package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Son extends Father{
    String car = "Scorpio";
    void home(){
        System.out.println("Son's 2BHK");
    }

    // Common method across all classes
    // For Dynamic dispatch
    void land(){
        System.out.println("Ancestor Property Land - Son's access");
    }
}
