package ex_17_OOPs;

public class Lab170_Dog_MainClass {
    public static void main(String[] args) {
        //Objects
        Dog d1 = new Dog(); // calling object of class Dog
        Lab170_Dog_AttributeBehaviour d2 = new Lab170_Dog_AttributeBehaviour(); // calling object of other class

        // calling using different class object -> Dog which is created in the same class file
        d1.dogName = "Dalmatians";
        d1.color = "White with black spots";
        System.out.println(d1.dogName);
        System.out.println(d1.color);
        d1.bark();

        System.out.println();

        //calling using different class object -> Lab170_Dog_AttributeBehaviour
        d2.dName = "Pomeranian";
        d2.dColor = "White";
        System.out.println(d2.dName);
        System.out.println(d2.dColor);
        d2.dBark();
    }

}
class Dog{
    // Attributes
    String dogName;
    String color;

    // Behaviour
    void bark(){
        System.out.println("Bow-Wow");
    }
}
