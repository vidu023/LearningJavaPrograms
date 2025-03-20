package ex_10_ForLoop;

public class Lab116_ForLoop_Continue_EvenNum {
    public static void main(String[] args) {
        // Using For Loop along with Continue to Print Even numbers

        // Even Num
       /* for(int i =0; i <= 50; i++) { // 0 to 50 -> 51 times
            if (i % 2 != 0) {
                continue; // skip the below code, move to top
            }
            System.out.println("Even num: " + i);

            // continue keyword will make sure that it skips the below statement
            // & print when the condition is false
        }*/

        // Another way to print Even num
         for(int i =0; i <= 50; i++) { // 0 to 50 -> 51 times
            if (i % 2 == 0) {
                System.out.println("Even num: " + i);
                continue; // skip the below code, move to top
            }
        }

         // Print Odd Num
        /* for(int i =0; i <= 50; i++) { // 0 to 50 -> 51 times
            if (i % 2 == 0) {
                continue; // skip the below code, move to top
            }
            System.out.println("Odd num: " + i);
        }*/
    }
}
