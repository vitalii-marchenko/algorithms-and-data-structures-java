package psets_for_recap.leetcode_problems;

public class MaxConsecutiveOnes {
    /**
     485. Max Consecutive Ones
     https://leetcode.com/problems/max-consecutive-ones/#/description
     Given a binary array, find the maximum number of consecutive 1s in this array.
     Example 1:
     Input: [1,1,0,1,1,1]
     Output: 3
     Explanation: The first two digits or the last three digits are consecutive 1s.
     The maximum number of consecutive 1s is 3.
     Note:
     The input array will only contain 0 and 1.
     The length of input array is a positive integer and will not exceed 10,000
     */

    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for (Integer n : nums) {
            if (n == 1) {
                counter += 1;
                max = Math.max(counter, max);
            } else {
                counter = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,0,1,1,1};
        int [] arr2 = {1,1,1,1,1,1,1,1};
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(arr));
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(arr2));
    }

}
