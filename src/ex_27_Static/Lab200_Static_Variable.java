package ex_27_Static;

public class Lab200_Static_Variable {
    public static void main(String[] args) {
        // static variable -> Eg blackboard
        // static mean common to all of them
         B ref1 = new B(15);
         ref1.displayOutput();
         //System.out.println(ref1.b); // static does not belong to object reference but class
        System.out.println(B.b); // b value remains the same
        B.b = 45; // latest value ob b is now 45 as it has been changed

        System.out.println("-------------------------");

         B ref2 = new B(25);
         ref2.displayOutput();
         System.out.println(B.b);
         //System.out.println(ref2.b);
    }
}

class B{

    // non-static/ properties/ instance variables/ fields/ attribute
    int a; // no initialization

    // static variables
    static int b = 20;
    // it means common across all of them

    B(int a){
        System.out.println("I am Parameterized Constructor");
        this.a = a;
    }

    void displayOutput(){
        System.out.println(this.a);
    }
}