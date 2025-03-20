package ex_10_ForLoop;

public class Lab101_ForLoop_Ex1 {
    public static void main(String[] args) {
        // for loop
        // repeat a block of code

        // Initialization -> Condition -> Updation (increment/ decrement)
        // I C U
        // we cannot inter change the order -> it will always be the same
        int i;
        // here i = 0 i.e. initialization will run only once
        // then only condition & updation will run int the loop till condition is met

        //pre increment or post increment in for loop doesnt make much a difference
        //but we prefer post increment

        for(i = 0; i < 10; i++){
            System.out.println(i);
            // this will run ten times from i = 0 till i = 9
            // then moment i = 10 it will come out of the loop

           /* Output
            0
            1
            2
            3
            4
            5
            6
            7
            8
            9   */
        }
    }
}
