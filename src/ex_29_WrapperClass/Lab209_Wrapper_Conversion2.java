package ex_29_WrapperClass;

public class Lab209_Wrapper_Conversion2 {
    public static void main(String[] args) {

        String num = "756";

        // convert String to Integer i.e. Wrapper ->2 ways
        // 1. -> parseX()
        Integer a = Integer.parseInt(num);
        System.out.println(a);
        // 2. valueOf()
        Integer b = Integer.valueOf(num);
        System.out.println(b);

        // convert String to primitive
        int c = Integer.parseInt(num);
        System.out.println(c);

        // wrapper to string -> toString() method
        System.out.println(a.toString());

        // Primitive to String
        int age = 85;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());

    }
}
