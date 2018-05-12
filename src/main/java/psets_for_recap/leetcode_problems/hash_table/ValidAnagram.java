package psets_for_recap.leetcode_problems.hash_table;

import java.util.*;

public class ValidAnagram {
    /**
     *

     Given two strings s and t , write a function to determine if t is an anagram of s.

     Example 1:

     Input: s = "anagram", t = "nagaram"
     Output: true
     Example 2:

     Input: s = "rat", t = "car"
     Output: false
     Note:
     You may assume the string contains only lowercase alphabets.
     */

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sCount = countLettersInString(s);
        Map<Character, Integer> tCount = countLettersInString(t);
        boolean contains = true;
        for (Map.Entry<Character, Integer> entry : sCount.entrySet()) {
            Character key = entry.getKey();
            int val = entry.getValue();
            if (!tCount.containsKey(key)) {
                return false;
            } else {
                if (tCount.get(key) != val) {
                    return false;
                }
            }
        }
        return contains;
    }

    private Map<Character,Integer> countLettersInString(String phrase) {
        Map<Character, Integer> count = new HashMap<>();
        for (Character letter : phrase.toCharArray()) {
            if (!count.containsKey(letter)) {
                count.put(letter, 1);
            } else {
                count.put(letter, count.get(letter) + 1);
            }
        }
        return count;
    }

    public boolean isAnagramCheatSolution(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return String.valueOf(sArr).equals(String.valueOf(tArr));
    }

    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] chars = new int[128];

        for (char c : s.toCharArray()) {
            chars[c]++;
        }

        for (char c : t.toCharArray()) {
            chars[c]--;
        }

        for (int i : chars) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram3("anagram", "nagaram"));
    }

}
