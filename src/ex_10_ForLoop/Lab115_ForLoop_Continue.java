package ex_10_ForLoop;

public class Lab115_ForLoop_Continue {
    public static void main(String[] args) {

        // continue -> it is used to skip

        for(int i =0; i < 50; i++){
            if (i == 5){
                System.out.println("Skip the below SOP Code when i = 5 & continue again");
                continue; // skip the below code, move to top
                // & continue the loop till i< 50
                // basically will skip when i = 5
            }
            System.out.println(i);
        }
    }
}
