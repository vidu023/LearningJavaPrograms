package ex_16_Arrays;

public class Lab156_Array_Reverse_Interview {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        // Reverse array of this is {5,4,3,2,1}

        for(int i = (numbers.length-1); i >= 0; i--){
            System.out.println(numbers[i]);
        }

    }
}
