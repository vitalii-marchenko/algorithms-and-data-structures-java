package psets_for_recap.leetcode_problems.hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {

    /*
    Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American
    keyboard like the image below.
    Example 1:
    Input: ["Hello", "Alaska", "Dad", "Peace"]
    Output: ["Alaska", "Dad"]
    Note:
    You may use one character in the keyboard more than once.
    You may assume the input string will only contain letters of alphabet.
     */



    public String[] findWords(String[] words) {
        Map<Character, Integer> rowsMapping = fillAllMappings();
        List<String> wordsList = new ArrayList<>();
        for (String word : words) {
            boolean oneLineWord = true;
            String wordLower = word.toLowerCase();
            char firstLetter = wordLower.charAt(0);
            for (Character ch : wordLower.toCharArray()) {
                if (rowsMapping.get(firstLetter) != rowsMapping.get(ch)) {
                    oneLineWord = false;
                    break;
                }
            }
            if (oneLineWord) {
                wordsList.add(word);
            }
        }
        return wordsList.toArray(new String[wordsList.size()]);

    }

    private Map<Character,Integer> fillAllMappings() {
        Map<Character, Integer> rowsMapping = new HashMap<>();
        rowsMapping.put('q', 1);
        rowsMapping.put('w', 1);
        rowsMapping.put('e', 1);
        rowsMapping.put('r', 1);
        rowsMapping.put('t', 1);
        rowsMapping.put('y', 1);
        rowsMapping.put('u', 1);
        rowsMapping.put('i', 1);
        rowsMapping.put('o', 1);
        rowsMapping.put('p', 1);

        rowsMapping.put('a', 2);
        rowsMapping.put('s', 2);
        rowsMapping.put('d', 2);
        rowsMapping.put('f', 2);
        rowsMapping.put('g', 2);
        rowsMapping.put('h', 2);
        rowsMapping.put('j', 2);
        rowsMapping.put('k', 2);
        rowsMapping.put('l', 2);

        rowsMapping.put('z', 3);
        rowsMapping.put('x', 3);
        rowsMapping.put('c', 3);
        rowsMapping.put('v', 3);
        rowsMapping.put('b', 3);
        rowsMapping.put('n', 3);
        rowsMapping.put('m', 3);
        return rowsMapping;
    }


    public static void main(String[] args) {
        String[] arr = {"Hello", "Alaska", "Dad", "Peace"};
        new KeyboardRow().findWords(arr);
    }
}
