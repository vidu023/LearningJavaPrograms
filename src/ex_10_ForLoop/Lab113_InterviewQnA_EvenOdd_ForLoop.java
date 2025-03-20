package ex_10_ForLoop;

public class Lab113_InterviewQnA_EvenOdd_ForLoop {
    public static void main(String[] args) {
            // Print Even & Odd numbers -> 1 to 50

            for(int i = 0; i <= 50; i++){
                if(i%2 == 0){
                    System.out.println("Even number "+i);
                }
                /*else{
                    System.out.println("Odd number "+i);
                }*/

                // accordingly if we want to show just even / od number only if loop is sufficient
                // if only one statement inside if else loop 
                // -> no need of brace brackets for single statements
            }
    }
}
