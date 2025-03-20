package ex_09_Switch;

public class Lab100_InterviewQnA {
    public static void main(String[] args) {

        char code = 'C';
        switch(code){

            case 'A' :
                System.out.println("65");
                break;
            case 'B' :
                System.out.println("66");
                break;
            default :
                System.out.println("Default");
                // this will be executed as code which is getting passed does not match with any case
                break;
        }

    }
}
