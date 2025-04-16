package ex_27_Static;

public class Lab199_Static_SIB {
    public static void main(String[] args) {
        P p1 = new P();
        // P is the class
        // p is the reference
        // new P() is the object creation

        // Here moment the class gets loaded static block is first called
        // Object creation -> IIB + Constructor is called

        new P(); // here also static will be called
        // as during object creation class will be loaded

        P p2 = new P(); // 3rd time object creation
        // here IIB -> 3 times & SIB -> 1 time
    }
}

class P{
    // static block is called first
    // it will be called only once as class will be loaded only once unlike IIB which will be called n number of times
    static {
        System.out.println("I am a static function");
    }
    {
        System.out.println("I am IIB function");
    }
    P(){
        System.out.println("I am a Default Constructor");
    }
}
