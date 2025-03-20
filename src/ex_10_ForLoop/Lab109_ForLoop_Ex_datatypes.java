package ex_10_ForLoop;

public class Lab109_ForLoop_Ex_datatypes {
    // we can use float, long etc data types with for loop
    // but its not advisable to use all this types in automation
    // as i++ increment/ decrement is always +1/ -1 which is an int value
    // we always prefer int in automation

    // we can also increase / decrease by 2 also & so on..
    // but it's not a common thing in automation
    // as for loop is used to do certain repeated tasks

    public static void main(String[] args) {
        for (long i = 1l; i <= 10l; i++){
            System.out.println(i);
        }
    }
}
