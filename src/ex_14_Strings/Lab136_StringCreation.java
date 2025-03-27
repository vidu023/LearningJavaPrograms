package ex_14_Strings;

public class Lab136_StringCreation {
    public static void main(String[] args) {
        // String class creation -> 2 ways

        String s1 = "vidya"; // will saved in string constant pool
        String s2 = new String("vidya"); // will be saved in object area
        // both are different

        System.out.println(s1);
        System.out.println(s2);
    }
}
