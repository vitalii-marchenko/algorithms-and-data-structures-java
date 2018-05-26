package psets_for_recap.leetcode_problems.math;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger {

    public int reverse(int x) {
        String res = "";
        int result = 0;
        int absNumToReverse = Math.abs(x);
        while (absNumToReverse > 0) {
            res += absNumToReverse % 10;
            absNumToReverse /= 10;
        }
        if (x == 0) {
            return 0;
        } else if (x < 0) {
            result = parseString(res) * (-1);
        } else {
            result = parseString(res);
        }
        return result;
    }

    private int parseString(String res) {
        int result = 0;
        try {
            result = Integer.valueOf(res);
        } catch (NumberFormatException e) {
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
        System.out.println(new ReverseInteger().reverse(0));
        System.out.println(new ReverseInteger().reverse(123));
        System.out.println(new ReverseInteger().reverse(-123));
    }
}
