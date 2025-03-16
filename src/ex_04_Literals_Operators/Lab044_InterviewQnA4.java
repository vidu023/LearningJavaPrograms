package ex_04_Literals_Operators;

public class Lab044_InterviewQnA4 {

    //Interview Question
    public static void main(String[] args) {
        byte salary = 12;
        boolean b = !(salary > 10 || salary < 5);
        System.out.println(b);

        // !(true || false) -> !true -> false
    }

}
