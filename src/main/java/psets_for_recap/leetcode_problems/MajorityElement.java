package psets_for_recap.leetcode_problems;

/*
    Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

    You may assume that the array is non-empty and the majority element always exist in the array.
 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int treshold = nums.length / 2;
        int res = 0;
        HashMap<Integer, Integer> elementsCount = countElements(nums);
        for (Map.Entry<Integer, Integer> entry : elementsCount.entrySet()) {
            if (entry.getValue() > treshold) {
                return entry.getKey();
            }
        }
        return res;
    }

    private HashMap<Integer, Integer> countElements(int[] nums) {
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
        int[] arr = {2,2,1,1,1,2,2};
        int[] arr2 = {3,2,3};
        new MajorityElement().majorityElement(arr);
        new MajorityElement().majorityElement(arr2);
    }
}
