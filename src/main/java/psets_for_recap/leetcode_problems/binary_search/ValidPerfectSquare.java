package psets_for_recap.leetcode_problems.binary_search;

/**
 *
 Given a positive integer num, write a function which returns True if num is a perfect square else False.

 Note: Do not use any built-in library function such as sqrt.

 Example 1:

 Input: 16
 Returns: True
 Example 2:

 Input: 14
 Returns: False
 */

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int maxNumOfIter = num / 2;
        boolean perfect = false;
        if (num == 0 || num == 1) {
            perfect = true;
        }
        for (int i = 0; i <= maxNumOfIter; i++) {
            int sqrt = i * i;
            if (sqrt == num) {
                perfect = true;
                break;
            } else if (sqrt > num) {
                break;
            }
        }
        return perfect;
    }

    public static void main(String[] args) {
        new ValidPerfectSquare().isPerfectSquare(4);
        new ValidPerfectSquare().isPerfectSquare(1);
        new ValidPerfectSquare().isPerfectSquare(16);
        new ValidPerfectSquare().isPerfectSquare(14);
    }

}
