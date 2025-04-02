package ex_15_StringBuilder_StringBuffer;

public class Lab149_StringBuilder_append {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("Vidya");
        str1.append("Kini"); // it will append VidyaKini
        str1.reverse(); // now it will reverse the string
        System.out.println(str1); // will print reverse of the string str1
    }
}
