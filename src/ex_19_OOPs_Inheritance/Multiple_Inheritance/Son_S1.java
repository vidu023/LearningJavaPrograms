package ex_19_OOPs_Inheritance.Multiple_Inheritance;

public class Son_S1 {

    //public class Son_S1 extends Mother_M1, Father_F1

    // Multiple Inheritance is not possible
    // Son cannot access from Multiple Parent class -> Father & Mother both
    // It will create a diamond problem
    // Only possible through -> Interface


    void cashS(){
            System.out.println("Son's Cash ");
        }
}
