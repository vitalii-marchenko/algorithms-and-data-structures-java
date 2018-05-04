package psets_for_recap;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramChecker {

    private boolean isAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] ch1 = getOnlyChars(s1).toCharArray();
        char[] ch2 = getOnlyChars(s2).toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s1Sorted = new String(ch1);
        String s2Sorted = new String(ch2);
        return s1Sorted.equals(s2Sorted);
    }


    private String getOnlyChars(String str) {
        String s = "";
        for (Character ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                s += ch;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new AnagramChecker().isAnagrams("rail safetY!", "fairy tales"));
        System.out.println(new AnagramChecker().isAnagrams("Hi there", "bye there"));
    }
}
