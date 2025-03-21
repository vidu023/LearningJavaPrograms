package ex_11_While;

public class Lab120_While_InterviewQnA {
    public static void main(String[] args) {
        // here it will not execute the while loop
        // i = 0 & 0 > 0 is false
        // also 0 < 0 is also false -> while (i<0) -> condition is false
        int i = 0; // I
        while (i>0){ // C
            System.out.println("Enter the Program");
            System.out.println(i);
            i++; // U
        }
    }
}
