package ex_15_StringBuilder_StringBuffer;

public class Lab150_StringBuilder_DeleteReplace {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Java");
        str1.append(" Programming");
        System.out.println(str1);

        str1.delete(5,16); // delete() acts like substring
        // it will delete from index 5 to 16
        System.out.println(str1);

        str1.replace(0,4,"C++"); // give start & end index value & replace String
        // here it starts from 0 & ends 4
        System.out.println(str1);
    }
}
