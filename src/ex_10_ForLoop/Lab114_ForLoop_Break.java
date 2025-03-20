package ex_10_ForLoop;

public class Lab114_ForLoop_Break {
    public static void main(String[] args) {
        // break -> it is used to come out of the loop

        for(int i =0; i < 50; i++){
            if (i == 5){
                System.out.println("Break out from the loop when i = 5");
                break;
            }
        }
    }
}
