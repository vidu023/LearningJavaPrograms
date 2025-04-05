package ex_16_Arrays;

public class Lab163_Array_Iterate_ForLoop {
    public static void main(String[] args) {

        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}}; // 3*3 Matrix

        // 1,2,3
        // 4,5,6
        // 7,8,9

        // Rows-> 3
        // Columns-> 3

        for (int i = 0; i < array.length; i++){ // 0 to 2 -> Row i.e. array.length -> row
            //for each row -> column i.e. array[i].length -> column
            for(int j = 0; j < array[i].length; j++){
                // System.out.println(array[i][j]); // Print the matrix in new line
                // System.out.print(array[i][j]); // Print all in one line
                System.out.print(array[i][j]+ " | "); // Print all in one line
            }
            System.out.println(); // after each row it will go to next line
        }
    }
}
