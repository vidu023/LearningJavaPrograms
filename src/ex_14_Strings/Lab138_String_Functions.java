package ex_14_Strings;

public class Lab138_String_Functions {
    public static void main(String[] args) {
        // Pre-built in functions

        // this is a char - '' -> single quote
        char a = 'A';
        System.out.println(a);

        //now this is a string -> in double quote ""
        //String s1 = "A";
        String s1 = "ABCDE";
        System.out.println(s1);
        System.out.println(s1.length()); // gives the length of the string s1
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("F"));


    }
}
