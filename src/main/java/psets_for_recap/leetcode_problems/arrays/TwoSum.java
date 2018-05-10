package psets_for_recap.leetcode_problems.arrays;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if ((nums[i] + nums[j] == target) && (i != j)) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,5,11};
        int[] arr3 = {2, 7, 11, 15};
        int[] arr2 = {3,2,3};
        new TwoSum().twoSum(arr, 10);
        new TwoSum().twoSum(arr, 9);
        new TwoSum().twoSum(arr2, 6);//expected 0,2
    }
}
