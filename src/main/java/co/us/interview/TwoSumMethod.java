package co.us.interview;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumMethod {
    /*
    * {2,7,11,15}, given array
    * 9 target value
    * Find the two indices, the sum of those two values of the index should be equal to target.
    * */

    public static void main(String[] args) {
        int[] result = getTwoSum(new int[]{2,7,11,15}, 9);
        System.out.println("result = " + Arrays.toString(result));
        System.out.println("result = " + Arrays.toString(getTwoSum(new int[]{2,7,8,3,11,15}, 11)));
    }

    private static int[] getTwoSum(int[] numbers, int target) {

        HashMap <Integer, Integer> numberIndexMap = new HashMap <>();

        for (int i = 0; i < numbers.length; i++) {
          if(numberIndexMap.containsKey(target-numbers[i])){
           return new int[]{i,numberIndexMap.get(target-numbers[i])};
          }
          numberIndexMap.put(numbers[i],i);
        }
        return new int[]{};
    }
}
