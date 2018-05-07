package psets_for_recap.leetcode_problems;

public class MoveZeroes {
    /*
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

    Note:
    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
     */

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    int tmp = nums[j + 1];
                    nums[j + 1] = 0;
                    nums[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(arr);
    }

}
