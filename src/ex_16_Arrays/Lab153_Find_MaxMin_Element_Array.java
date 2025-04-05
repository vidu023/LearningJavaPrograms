package ex_16_Arrays;

public class Lab153_Find_MaxMin_Element_Array {
    public static void main(String[] args) {
        // find maximum & minimum element from the array
        // we take input from the user also

        int[] array = {51,89,46,77,95,63,99,76,59,44,35,47};

        int max = array[0];
        // find max element
        for(int i = 0; i < array.length; i++ ){
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max element in the array is: "+max);

        int min = array[0];
        // find min element
        for(int i = 0; i < array.length; i++ ){
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min element in the array is: "+min);
    }
}
