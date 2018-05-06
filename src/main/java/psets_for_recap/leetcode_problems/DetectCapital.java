package psets_for_recap.leetcode_problems;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        int numOfCapitals = countCapitals(word);
        int len = word.length();
        if (numOfCapitals == len) {
            return true;
        } else if (numOfCapitals == 0) {
            return true;
        } else if (Character.isUpperCase(word.charAt(0)) && len > 1 && numOfCapitals == 1) {
            return true;
        } else {
            return false;
        }
    }

    private int countCapitals(String word) {
        int numOfCapitals = 0;
        for (Character character : word.toCharArray()) {
            if (Character.isUpperCase(character)) {
                numOfCapitals += 1;
            }
        }
        return numOfCapitals;
    }

    public static void main(String[] args) {
        System.out.println(new DetectCapital().detectCapitalUse("USA"));
        System.out.println(new DetectCapital().detectCapitalUse("Google"));
        System.out.println(new DetectCapital().detectCapitalUse("FlaG"));
    }

}
