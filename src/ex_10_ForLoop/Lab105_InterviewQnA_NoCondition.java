package ex_10_ForLoop;

public class Lab105_InterviewQnA_NoCondition {
    public static void main(String[] args) {
        // No Condition is given inside for loop here

        for(int i = 0; ; i++){
            // since no condition this will run infinite as it will go on incrementing
            //so it need to be stopped  by clicking stop button
            System.out.println(i);

            // i will get this -> exit code 130 means stopped by yourself/ killed
            // exit code 0 -> execution was successful
        }
    }
}
