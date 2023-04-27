package co.us.interview;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateElementInArray {
    public static void main(String[] args) {

        System.out.println("containsDuplicateBruteForce(new int[]{1,2,3,1}) = " + containsDuplicateBruteForce(new int[]{1, 2, 3, 1}));
        System.out.println("containsDuplicateBruteForce(new int[]{1,2,3,1}) = " + containsDuplicateBruteForce(new int[]{1, 2, 3, 4}));
        System.out.println("containsDuplicate(new int[]{1,2,3,1}) = " + containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println("containsDuplicateUsingMapOrSet(new int[]{1,2,3,1}) = " + containsDuplicateUsingMapOrSet(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }

    /*
     * time complexity O(n2)
     * space complexity O(n)
     * */
    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * time complexity O(2n)
     * space complexity O(n)
     * */
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /*
     * time complexity O(n)
     * space complexity O(2n)
     * */
    public static boolean containsDuplicateUsingMapOrSet(int[] nums) {
        HashSet <Integer> integers = new HashSet <>();
        for (int num : nums) {
            if (integers.contains(num)) {
                return true;
            }
            integers.add(num);
        }
        return false;
    }
}
