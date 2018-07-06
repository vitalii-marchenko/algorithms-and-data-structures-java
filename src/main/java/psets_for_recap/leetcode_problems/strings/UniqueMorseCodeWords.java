package psets_for_recap.leetcode_problems.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    String[] morseEncodings = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
            "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


    public int uniqueMorseRepresentations(String[] words) {
        Set<String> morseWords = new HashSet<>();
        for (String word : words) {
            morseWords.add(toMorse(word));
        }
        return morseWords.size();
    }

    public String toMorse(String word) {
        StringBuilder builder = new StringBuilder();
        for (char ch : word.toCharArray()) {
            int charIndex = ch - 'a';
            builder.append(morseEncodings[charIndex]);
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        String[] arr = {"gin", "zen", "gig", "msg"};
        new UniqueMorseCodeWords().uniqueMorseRepresentations(arr);
    }
}
