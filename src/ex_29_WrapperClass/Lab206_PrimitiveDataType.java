package ex_29_WrapperClass;

public class Lab206_PrimitiveDataType {
    public static void main(String[] args){
        int a = 10;
        // this is a primitive data type
        // not an object
        // so it wont have any attributes or behaviour

        // here a is a primitive local variable

        // from now onwards we will avoid - char, byte, int, shot, float, double, boolean etc
        // because in Collection Framework we shall be using only wrapper class
        // every wrapper class is final class which extends from Number
        Integer num = 65; // Integer is a wrapper class

        System.out.println(Integer.toHexString(65)); // Integer. has many inbuilt functions to ue
    }
}
