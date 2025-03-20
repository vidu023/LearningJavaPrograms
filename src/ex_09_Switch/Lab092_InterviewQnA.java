package ex_09_Switch;

public class Lab092_InterviewQnA {
    public static void main(String[] args) {

        int a = 10;
        switch (a){

            case 10 :
                // this is allowed -> int 'a' can be passed into the switch as it will match the case with int number
                System.out.println("10");
                break;
            default :
                System.out.println("Hello");
                break;

             // its a valid syntax as its a integer value

        }
    }
}
