package psets_for_recap.leetcode_problems.arrays;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]

 */

public class TwoSum2 {

    public int[] twoSum(int[] nums, int target) {
        int index = 1;
        int[] res = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = index; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                   res = new int[]{i, j};
                   System.out.println("Result is: " + i + ", " + j);
                   return res;
                }
            }
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] input = {2,7,11,15};
        twoSum2.twoSum(input, 9);

        int[] input2 = {3,2,4};

        twoSum2.twoSum(input2, 6);
    }
}
