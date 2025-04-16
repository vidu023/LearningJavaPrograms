package ex_24_OOPs_Abstraction_AbstractClass;

public class Lab191_Abstraction {

    // For abstract class we need to specify using abstract keyword

    public static void main(String[] args) {

        Son s1 = new Son();
        // by creating an object of son class
        // it cannot be recognised which is parent function & then which
        // it is hidden
        s1.loan50k();
        s1.loan25k();

        // Father f1 = new Father(); // not possible
        // we cannot create an object of abstract class

        // Father f2 = new Son(); // this possible
    }
}

abstract class Father{
    // if a class has abstract method it's also an abstract class

    abstract void loan50k();

    void loan25k(){
        System.out.println("Loan of 25k is given by father");
    }

}

class Son extends Father{
    @Override
    void loan50k() {
        // over-ride method of Father class
        System.out.println("Son gave the loan of 50K which is of his father's");

    }
    // moment a child class extends an abstract class
    // it has to override that abstract method of base class -> Father

}
