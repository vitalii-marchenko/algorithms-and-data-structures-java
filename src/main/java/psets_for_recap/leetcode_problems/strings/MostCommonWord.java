package psets_for_recap.leetcode_problems.strings;

import com.sun.tools.javac.code.Scope;

import java.util.*;

/**
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
 *
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.
 *
 * Example:
 * Input:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 *
 *
 * Note:
 *
 * 1 <= paragraph.length <= 1000.
 * 1 <= banned.length <= 100.
 * 1 <= banned[i].length <= 10.
 * The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols, and even if it is a proper noun.)
 * paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
 * Different words in paragraph are always separated by a space.
 * There are no hyphens or hyphenated words.
 * Words only consist of letters, never apostrophes or other punctuation symbols.
 */

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] wordsArr = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        List<String> allWords = new ArrayList<>();
        List<String> ban = Arrays.asList(banned);
        for (String word : wordsArr) {
            if (!ban.contains(word))
            allWords.add(word.toLowerCase());
        }
        List<String> wordsToPrecess = new ArrayList<>();
        wordsToPrecess.addAll(allWords);
        HashMap<String, Integer> elementsCount = countElements(wordsToPrecess);
        Map.Entry<String,Integer> entry = elementsCount.entrySet().iterator().next();
        String maxWord = entry.getKey();
        int maxCount = entry.getValue();
        for (Map.Entry<String, Integer> myEntry : elementsCount.entrySet()) {
            String key = myEntry.getKey();
            if (myEntry.getValue() > maxCount) {
                maxWord = key;
            }
        }
        return maxWord;
    }

    private HashMap<String, Integer> countElements(List<String> words) {
        HashMap<String, Integer> elementsCount = new HashMap<>();
        for (String word : words) {
            if (elementsCount.containsKey(word)) {
                elementsCount.put(word, elementsCount.get(word) + 1);
            } else {
                elementsCount.put(word, 1);
            }
        }
        return elementsCount;
    }

    public static void main(String[] args) {
        String[] arr = {"hit"};
        new MostCommonWord().mostCommonWord(
                "Bob hit a ball, the hit BALL flew far after it was hit.", arr);
    }
}
