package ex_16_Arrays;

public class Lab154_MaxMin_usingFunction {
    public static void main(String[] args) {
        // find maximum & minimum element from the array

        int[] array = {51,89,46,77,95,63,99,76,59,44,35,47};

        // creating a function for max
        int max_array = give_me_max(array);
        System.out.println("Max element in the array is: "+max_array);

        // creating a function for min
        int min_array = give_me_min(array);
        System.out.println("Min element in the array is: "+min_array);

    }

    // Mim function
    private static int give_me_min(int[] array) {
        int min = array[0];
        // find min element
        for(int i = 0; i < array.length; i++ ){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Max Function
    private static int give_me_max(int[] array) {
        int max = array[0];
        // find max element
        for(int i = 0; i < array.length; i++ ){
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
