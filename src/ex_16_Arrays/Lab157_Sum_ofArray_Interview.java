package ex_16_Arrays;

public class Lab157_Sum_ofArray_Interview {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        // Sum of this array is 1+2+3+4+5 = 15

        int total = 0;
        /*
        for(int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
        }
        System.out.println("Sum of the array is: "+total);
        */

        // Enhanced For Loop -> for each
        // it wil not go through the indexes but through elements

        System.out.println("----For Each -> Enhanced For Loop----");
        // it will take directly the value i.e 1 then 2 then 3 etc till 5
        for (int n: numbers){
            total = total + n;
        }
        System.out.println("Sum of the array is: "+total);
    }
}
