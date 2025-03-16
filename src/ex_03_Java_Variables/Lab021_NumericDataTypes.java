package ex_03_Java_Variables;

public class Lab021_NumericDataTypes {
    public static void main(String[] args) {
        //byte b = 128; // max byte can store is 127 as limit is -128 to 127
        // byte cannot store 128 value -> limit reached
        //int phone_number  = 9876543210; // int cannot store such a long value
        //so we need to use long
        long phone_number = 9876543210l; // we need to add l or L at the end
//        long phone_number = 9876543210L;
        System.out.println(phone_number);
        //l or L signifies its a long type of variable value stored
    }
}
