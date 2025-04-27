package ex_32_CollectionFramework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab260_TwoSumProblem_LeetCode {
    // Leet Code challenges
    // Find that 2 elements whose addition is the target
    // duplicates won't be allowed
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 9;
        int [] result = twoSum(numbers,target);

        if(result != null){
            //printing the index which has those 2 numbers whose addition is equal to the target
            System.out.println("Indices: ["+ result[0] + ", " + result[1] + "]");
        } else{
            System.out.println("No Solution");
        }
    }

    private static int[] twoSum(int[] numbers, int target) {

        Map <Integer, Integer> map = new HashMap();
        for (int i = 0; i<numbers.length; i++){
            // here we do reverse
            // we know the target is 9, we need elements whose addition is 9
            // so if you get the 1st element that means addition of two numbers will be 9
            // and purpose solved
            // that means if complement is available in the map then we can find the element
            int complement = target-numbers[i]; // value of each index i

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(numbers[i],i); // its value & its index
        }
        return null;
    }
}
