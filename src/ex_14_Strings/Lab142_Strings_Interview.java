package ex_14_Strings;

public class Lab142_Strings_Interview {
    public static void main(String[] args) {
        // Compare to check the location

        // SCP -> 1 string Hello
        String s2 = "Hello";
        String s3 = "Hello";

        // OA -> 2 strings with Hello
        String s6 = new String("Hello");
        String s8 = new String("Hello");

        // == is used for comparison usually
        // but in String it checks for location ref

        System.out.println(s2 == s6); // is s2 = s6? // false
        // because both are present in different areas

        System.out.println(s6 == s8); // is s6 = s8? // false
        // because both are different strings even if they are present in OA

        System.out.println(s2 == s3); // is s2 = s3? // true
        // yes as both are pointing to same location in SCP
    }
}
