package psets_for_recap.leetcode_problems.strings;

/**
 * Given a string, your task is to count how many palindromic substrings in this string.
 *
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 *
 * Example 1:
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2:
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * Note:
 * The input string length won't exceed 1000.
 */

public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int res = 0;
        int len = s.length();

        for (int start = 0; start < len; start++) {
            for (int stop = start; stop < len; stop++) {
                String chunk = s.substring(start, stop + 1);
                if (chunk.equals(reverse(chunk))) {
                    res += 1;
                }
            }
        }
        return res;
    }

    private String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
//        int lastIndex = s.length() - 1;
//        for (int i = lastIndex; i >= 0; i--) {
//            stringBuilder.append(s.charAt(i));
//        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        new PalindromicSubstrings().countSubstrings("aba");
    }
}
