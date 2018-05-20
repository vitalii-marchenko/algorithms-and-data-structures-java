package psets_for_recap.leetcode_problems.strings;

import psets_for_recap.leetcode_problems.linked_lists.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * S and T are strings composed of lowercase letters. In S, no letter occurs more than once.
 *
 * S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.
 *
 * Return any permutation of T (as a string) that satisfies this property.
 *
 * Example :
 * Input:
 * S = "cba"
 * T = "abcd"
 * Output: "cbad"
 * Explanation:
 * "a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a".
 * Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.
 *
 *
 * Note:
 *
 * S has length at most 26, and no character is repeated in S.
 * T has length at most 200.
 * S and T consist of lowercase letters only.
 */

public class CustomSortString {

    public String customSortString(String S, String T) {
        char[] intersectionLetters = new char[S.length()];
        char[] TLetters = T.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (char letter : S.toCharArray()) {
            int letterIndex = T.indexOf(letter);
            if (letterIndex >= 0) {
                intersectionLetters[index] = letter;
                TLetters[letterIndex] = 0;
                index++;
            }
        }
        List<Character> intersectionListChar = charArraytoList(intersectionLetters);
        for (Character ch : TLetters) {
            if (ch != 0) {
                int i = intersectionListChar.indexOf(ch);
                if (i >= 0) {
                    intersectionListChar.add(i + 1, ch);
                } else {
                    intersectionListChar.add(ch);
                }
            }
        }
        return convertListToString(intersectionListChar) + stringBuilder.toString();
    }

    private List<Character> charArraytoList(char[] arr) {
        List<Character> list = new ArrayList<>();
        for (Character ch : arr) {
            list.add(ch);
        }
        return list;
    }

    private String convertListToString(List<Character> arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : arr) {
            if (ch != 0) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    // Cool solution!!!
    public String customSortString2(String S, String T) {
        String seq = "";
        String result = "";

        for (int i = 0; i < S.length(); i++) {
            for (int k = 0; k < T.length(); k++) {
                if (T.charAt(k) == S.charAt(i)) {
                    seq += S.charAt(i);
                }
            }
            T = T.replaceAll(S.charAt(i) + "", "");
        }

        return seq + T;
    }

    public static void main(String[] args) {
        new CustomSortString().customSortString2("cba", "abcd"); // expected "cbad"
        new CustomSortString().customSortString("kqep", "pekeq"); // expected "kqeep"

    }
}
