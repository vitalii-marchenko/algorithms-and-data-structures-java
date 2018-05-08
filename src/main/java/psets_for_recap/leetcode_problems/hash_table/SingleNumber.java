package psets_for_recap.leetcode_problems.hash_table;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numOfOccur = countNums(nums);
        for (Map.Entry<Integer, Integer> entry : numOfOccur.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    private Map<Integer,Integer> countNums(int[] nums) {
        HashMap<Integer, Integer> elementsCount = new HashMap<>();
        for (Integer num : nums) {
            if (elementsCount.containsKey(num)) {
                elementsCount.put(num, elementsCount.get(num) + 1);
            } else {
                elementsCount.put(num, 1);
            }
        }
        return elementsCount;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        new SingleNumber().singleNumber(arr);
    }
}
