package ex_04_Literals_Operators;

public class Lab038_InterviewQnA1 {
    public static void main(String[] args) {

        //Concatenation
        System.out.println("Vidya"+"Kini");

        // it will concatenate if they used along with Strings
        // but with arithmetic operators it will add
        // + -> it behaves differently with data type
        // + -> operator overloading

        byte a = 95;
        byte b = 32;
        System.out.println(a+b);

        String name1 = "Hello";
        String name2 = "World";
        System.out.println(name1+name2);
    }
}
