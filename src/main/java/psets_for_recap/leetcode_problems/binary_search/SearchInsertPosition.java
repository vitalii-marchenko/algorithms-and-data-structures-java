package psets_for_recap.leetcode_problems.binary_search;

public class SearchInsertPosition {
    /**
     * Given a sorted array and a target value, return the index if the target is found. If not,
     * return the index where it would be if it were inserted in order.
     *
     * You may assume no duplicates in the array.
     *
     * Example 1:
     *
     * Input: [1,3,5,6], 5
     * Output: 2
     * Example 2:
     *
     * Input: [1,3,5,6], 2
     * Output: 1
     * Example 3:
     *
     * Input: [1,3,5,6], 7
     * Output: 4
     * Example 4:
     *
     * Input: [1,3,5,6], 0
     * Output: 0
     */

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int index = 0;
        boolean found = false;
        while (low <= high) {
            int mid = (high + low) / 2;
            int guess = nums[mid];
            if (guess == target) {
                index =  mid;
                found = true;
                break;
            } else if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (found) {
            return index;
        } else {
            for (int i = 0; i < len; i++) {
                int curr = nums[i];
                if (curr > target) {
                    index = i;
                    found = true;
                    break;
                }
            }
        }
        return found ? index : len;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        new SearchInsertPosition().searchInsert(arr, 2); // expected 4;
    }
}
