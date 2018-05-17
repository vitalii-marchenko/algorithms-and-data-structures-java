package psets_for_recap.leetcode_problems.strings;

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

    // NOT WORKING SOLUTION
    public String customSortString(String S, String T) {
        char[] intersectionLetters = new char[T.length()];
        StringBuilder toEnd = new StringBuilder();
        for (char letter : T.toCharArray()) {
            if (S.indexOf(letter) >= 0) {
                int index = S.indexOf(letter);
                intersectionLetters[index] = letter;
            } else {
                toEnd.append(letter);
            }
        }
        String s = convertArrToString(intersectionLetters);
        return s + toEnd.toString();
    }

    private String convertArrToString(char[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : arr) {
            if (ch != 0) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new CustomSortString().customSortString("kqep", "pekeq"); // expected "kqeep"

    }
}
