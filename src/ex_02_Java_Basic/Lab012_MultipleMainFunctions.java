package ex_02_Java_Basic;

public class Lab012_MultipleMainFunctions {
    //multiple main function

    public static void main(String[] args) {
        System.out.println("1st main function");
    }

    //below main functions are not recognised

    public static void main(String args) {
        System.out.println("2nd main function");
    }
    public static void main(int args) {
        System.out.println("3rd main function");
    }
}
