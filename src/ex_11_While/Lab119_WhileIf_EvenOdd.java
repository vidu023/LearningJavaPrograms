package ex_11_While;

public class Lab119_WhileIf_EvenOdd {
    public static void main(String[] args) {
        // Print Even & Odd Numbers using While & If loops
        int i = 0;
        while(i<=10){
            if(i%2 ==0) {
                System.out.println(i + "- is an Even Num");
            }else {
                System.out.println(i + "- is a Odd num");
            }
            i++;
        }
    }
}
