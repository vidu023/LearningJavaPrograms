package ex_14_Strings;

public class Lab143_String_Interview {
    public static void main(String[] args) {
        // To Check the Content of the string is equal or not

        // SCP -> 1 string Hello
        String s2 = "Hello";
        String s3 = "Hello";

        // OA -> 2 strings with Hello
        String s6 = new String("Hello");
        String s8 = new String("Hello");
        String s5 = new String("hello");

        //equals is used
        System.out.println(s2.equals(s6));
        System.out.println(s6.equals(s8));
        System.out.println(s2.equals(s3));

        //content can be equal but not the location

        System.out.println(s8.equals(s5)); // s8-> Hello & s5 -> hello so both are not equal
        System.out.println(s8.equalsIgnoreCase(s5)); // if we want to ignore the case to check the value

        // equalIgnoreCase will ignore all types of cases  like -> Vidya, VIDYA, vIDya, vidya etc
    }
}
