package ex_29_WrapperClass;

public class Lab208_Wrapper_conversion {
    public static void main(String[] args) {

        int a = 75;
        Integer b = a;
        // this is called boxing -> autoboxing
        // automatically JVM will store the value of primitive to wrapper

        Integer x = 40;
        int y = x;
        // this is called unboxing
        // wrapper is removed->
        // all attributes or methods are lost

    }
}
