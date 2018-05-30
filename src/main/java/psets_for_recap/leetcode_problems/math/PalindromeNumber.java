package psets_for_recap.leetcode_problems.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

 Example 1:

 Input: 121
 Output: true
 Example 2:

 Input: -121
 Output: false
 Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 Example 3:

 Input: 10
 Output: false
 Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 Follow up:

 Coud you solve it without converting the integer to a string?
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        List<Integer> reversedList = new ArrayList<>();
        if (x < 0) {
            return false;
        }

        while (x > 0) {
            reversedList.add(x % 10);
            x /= 10;
        }
        List<Integer> original = new ArrayList<>();
        original.addAll(reversedList);
        Collections.reverse(original);
        return reversedList.equals(original);
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
    }
}
