package psets_for_recap.leetcode_problems.hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 *
 You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

 The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

 Example 1:

 Input: J = "aA", S = "aAAbbbb"
 Output: 3
 Example 2:

 Input: J = "z", S = "ZZ"
 Output: 0
 Note:

 S and J will consist of letters and have length at most 50.
 The characters in J are distinct.
 */

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int numOfJewels = 0;
        Map<Character, Integer> stonesCount = countStones(S);
        for (Character ch : J.toCharArray()) {
            if (stonesCount.containsKey(ch)) {
                numOfJewels += stonesCount.get(ch);
            }
        }
        return numOfJewels;
    }

    private Map<Character,Integer> countStones(String s) {
        Map<Character, Integer> stonesCount = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (stonesCount.containsKey(ch)) {
                stonesCount.put(ch, stonesCount.get(ch) + 1);
            } else {
                stonesCount.put(ch, 1);
            }
        }
        return stonesCount;
    }


    public static void main(String[] args) {
        new JewelsAndStones().numJewelsInStones("aAccc", "aAAbbbb");
    }


}
