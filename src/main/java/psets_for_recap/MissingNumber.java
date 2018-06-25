package psets_for_recap;

/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity.
Could you implement it using only constant extra space complexity?
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        List<Integer> numsList = fromArrToList(nums);
        Collections.sort(numsList);
        for (int i = 0; i < numsList.size() - 1; i++) {
            int next = numsList.get(i + 1);
            int curr = numsList.get(i);
            if ((next - curr) > 1) {
                return curr + 1;
            }
        }
        return 0;
    }


    private List<Integer> fromArrToList(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int n : arr) {
            res.add(n);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,8,0};
        System.out.println(new MissingNumber().missingNumber(arr));
    }
}
