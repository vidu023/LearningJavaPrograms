package ex_14_Strings;

public class Lab144_String_Interview {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str3.equals(str1)); // true
        System.out.println(str1 == str2); // true
        System.out.println(str2 == str3); // false
    }
}
