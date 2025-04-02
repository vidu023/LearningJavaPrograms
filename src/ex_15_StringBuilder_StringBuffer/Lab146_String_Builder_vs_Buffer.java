package ex_15_StringBuilder_StringBuffer;

public class Lab146_String_Builder_vs_Buffer {
    public static void main(String[] args) {
        // StringBuilder & StringBuffer class but we shall be using rarely for automation

        StringBuilder str1 = new StringBuilder("Vidya"); // OA
        System.out.println(str1);
        System.out.println(str1.toString());

        StringBuffer str2 = new StringBuffer("Vidya"); // OA
        System.out.println(str2);

        //90% we are going to use String class
        String str3 = "Vidya"; // SCP
        String str4 = new String("Vidya"); // OA

        // there is no difference in the output i.e. while printing
        // but there is =huge difference in storing
        // all with new keyword is stored in Object Area (OA)
        // and str1 is String Constant Pool (SCP)
        // all will be created & stored differently
    }
}
