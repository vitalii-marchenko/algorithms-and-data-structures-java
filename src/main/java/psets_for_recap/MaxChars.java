package psets_for_recap;


import java.util.HashMap;
import java.util.Map;

public class MaxChars {

    private char mostRecentChar(String s) {
        Map<Character, Integer> charsCount = new HashMap<Character, Integer>();

        for (Character c : s.toCharArray()) {
            if (charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c) + 1);
            } else {
                charsCount.put(c, 1);
            }
        }

        Map.Entry<Character, Integer> firstPair = charsCount.entrySet().iterator().next();
        char ch = firstPair.getKey();
        int maxCount = firstPair.getValue();
        for (Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
            int currentValue = entry.getValue();
            if (currentValue > maxCount) {
                maxCount = currentValue;
                ch = entry.getKey();
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        System.out.println(new MaxChars().mostRecentChar("asdsaf fassssdfsss"));
    }
}
