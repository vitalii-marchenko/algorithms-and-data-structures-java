package psets_for_recap.leetcode_problems.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringNoRepeating {

    public int lengthOfLongestSubstring2(String s) {
        Map<Character, Boolean> mapVisitors = new HashMap<>();
        int len = s.length();
        int longest = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                char current = s.charAt(j);
                if (mapVisitors.containsKey(current)) {
                    if (mapVisitors.size() > longest) {
                        longest = mapVisitors.size();
                    }
                    mapVisitors = new HashMap<>();
                    } else {
                    mapVisitors.put(current, true);
                    if (mapVisitors.size() > longest) {
                        longest = mapVisitors.size();
                    }
                }
            }
            mapVisitors = new HashMap<>();
        }

        if (mapVisitors.isEmpty() && longest == 0) {
            return len;
        }
        return longest;
    }


    // Time complexity O(n), space complexity O(n)
    // https://discuss.leetcode.com/topic/8232/11-line-simple-java-solution-o-n-with-explanation
    // https://discuss.leetcode.com/topic/24739/c-code-in-9-lines
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 1;
        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                // do not use just left = map.get(c)+1; try s="abba"
                // because of we don`t clean the map, when right is last a, we should set the left to 2nd b,
                // instead of 1st a.
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringNoRepeating().lengthOfLongestSubstring("pwwkew"));
    }
}
