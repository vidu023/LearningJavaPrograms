package ex_16_Arrays;

import java.util.Arrays;

public class Lab158_Find_2ndHighestNum_Array {
    public static void main(String[] args) {

        int[] numbers = {51,92,73,48,85,9,88,56,70};

        // Easiest way is sort the numbers and print the 2nd highest number i.e. number.length -2
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

        // but interviewers dont want you to use this
    }
}
