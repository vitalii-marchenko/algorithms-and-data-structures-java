package psets_for_recap.leetcode_problems.arrays;

/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String numberToTest = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(numberToTest);
        String reversedString = stringBuilder.reverse().toString();

        return numberToTest.equals(reversedString);
    }

    public boolean isPalindrome2(int x) {
        String numberToTest = String.valueOf(x);
        String reversedString = "";
        char[] arrayToRevert = numberToTest.toCharArray();

        for (int i = arrayToRevert.length - 1; i >= 0; i--) {
            reversedString += arrayToRevert[i];
        }
        return reversedString.equals(numberToTest);
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
        System.out.println(palindromeNumber.isPalindrome(-121));
        System.out.println(palindromeNumber.isPalindrome(10));

        System.out.println("==========");

        System.out.println(palindromeNumber.isPalindrome2(121));
        System.out.println(palindromeNumber.isPalindrome2(-121));
        System.out.println(palindromeNumber.isPalindrome2(10));
    }
}
