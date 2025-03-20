package ex_09_Switch;

public class Lab099_InterviewQnA {
    public static void main(String[] args) {

        int a = 1;
        switch (-1){
            case 1 :
                System.out.println("1");
                break;
            case(-1) :
                System.out.println("-1");
                // this will be the output as it will match with number or value passed in switch statement
                break;
            default :
                System.out.println("none");
                break;
        }
    }
}
