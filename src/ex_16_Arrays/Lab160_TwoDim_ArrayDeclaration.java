package ex_16_Arrays;

public class Lab160_TwoDim_ArrayDeclaration {
    public static void main(String[] args) {
        // 1, 2, 3
        // 4, 5, 6
        // 7, 8, 9

        // alternatively we can create a 2D array like this also
        int[][] array_old = {{1,2,3}, {4,5,6}, {7,8,9}};
        //                      R1       R2       R3
        int[][] predefined = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Rows -> 3
        // Columns -> 3
        // ist indicated row num & 2nd indicate column num -> i.e. 3 * 3 matrix
        int[][] array_2d = new int[3][3];

        // we need to save the value also
        // 1 -> 0,0
        // 2 -> 0,1
        // 3 -> 0,2
        // 4 -> 1,0
        // 5 -> 1,1
        // 6 -> 1,2
        // 7 -> 2,0
        // 8 -> 2,1
        // 9 -> 2,2

        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;
        array_2d[1][0] = 4;
        array_2d[1][1] = 5;
        array_2d[1][2] = 6;
        array_2d[2][0] = 7;
        array_2d[2][1] = 8;
        array_2d[2][2] = 9;
        // array_2d[2][3] = 10; // since we dont have this -> ArrayIndexOutOfBoundsException Error
    }
}
