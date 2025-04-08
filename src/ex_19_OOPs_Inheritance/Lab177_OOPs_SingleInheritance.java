package ex_19_OOPs_Inheritance;

public class Lab177_OOPs_SingleInheritance {
    public static void main(String[] args) {
        // Single Inheritance
        // Derived class is only Son can inherit Father class using keyword 'extends'

        // Reverse is not true i.e. Father cannot access Son's attribute or function
        // because there is no relationship with Father to son
        // this is called cyclic inheritance which is not possible
        // Father extends Son & Son extends Father is not possible

        //Here both are different class and Son cannot access Father's A & B if no extend keyword is used
        //There is no relationship between the 2
        //Both Father & Son are different class / entity

        // To make the relationship we need to add keyword -> 'extends'
        // class Son extends Father
        // extends keyword makes sure that all Attributes & Function of Father class are now accessible to Son class
        // that means it is as good as present in/ part of/ inside the Son class

        //Father Object
        Father f1 = new Father();
        System.out.println("Gold in grams Father has: "+f1.gold_gms);
        f1.home_2bhk();
        System.out.println("---------------------------------------");

        //Son Object
        Son s1 = new Son();
        // his own attributes & function
        System.out.println("Car which Son has: "+s1.car);
        s1.home_3bhk();
        // due to extends keyword -> Single Inheritance
        // son can now access father's attributes & function
        System.out.println("Son now inherits Father gold: "+s1.gold_gms); // Father's gold
        s1.home_2bhk(); // Father's home -> Son can access now due to Inheritance

    }
}

class Father{

    //Attributes/ Instance Variable/ Data Variable/ Properties
    int gold_gms = 5000;

    //Behaviour/ Data Members/ Functions/ Methods
    void home_2bhk(){
        System.out.println("Father - 2BHK");
    }
}

class Son extends Father{ // extends keyword for Inheritance

    String car = "Scorpio";

    void home_3bhk(){
        System.out.println("Son - 2BHK");
    }
}

// Daughter can also inherit from the same father
// we shall see that later - Hierarchical Inheritance
// yes possible
/*
class Daughter extends Father{

}*/
