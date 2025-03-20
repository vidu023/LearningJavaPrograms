package ex_09_Switch;

public class Lab093_InterviewQnA {
    public static void main(String[] args) {
        char a = 'A';
        switch (a) {

            case 65:
                System.out.println("Its an ASCII value of A");
                // this will match
                // A -> 65 is the corresponding ASCII value
                break;
            case 'B':
                // this is also allowed -> char 'A' can be passed into the switch as it will match the case with char
                // char is also an int
                System.out.println("A");
                break;
            default:
                System.out.println("No Char / ASCII Match");
                break;
        }
    }
}
