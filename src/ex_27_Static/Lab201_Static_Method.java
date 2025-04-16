package ex_27_Static;

public class Lab201_Static_Method {
    public static void main(String[] args) {
        // static method
        C.commonToAll(); // can be called without object creation
        System.out.println(C.b);
        //C.display(); // cannot be called without object creation

         C c1 = new C();
    }

}

class C{
    static {
        System.out.println("I am static, loaded once - during class is loaded");
    }

    int a = 10;
    static int b = 20;

    void display(){
        System.out.println(b); // we can use static variable inside nonstatic method
        System.out.println("Non-static method");
    }

    static void commonToAll(){
        //System.out.println(a); // instance variable cannot be called inside static method
        System.out.println("Static method");
    }

    static class D{
        // non-static class -> but we never use them in automation
    }
}