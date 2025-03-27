package ex_14_Strings;

public class Lab135_Strings_immutable {
    public static void main(String[] args) {
        // can give this example in the interview
        String name = "vidya";
        name.toUpperCase(); // VIDYA
        System.out.println(name);

        // name.toUpperCase is not assigned to name is pointing to -> vidya & not VIDYA
        // name.toUpperCase -> VIDYA string has been created & if i want to print the new value
        // I need to assign the value
        // name = name.toUpperCase();

        // 2 strings are been created in string constant pool
    }
}
