package psets_for_recap.leetcode_problems.strings;

/**
 *
 A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

 We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

 The rules of Goat Latin are as follows:

 If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 For example, the word 'apple' becomes 'applema'.

 If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
 For example, the word "goat" becomes "oatgma".

 Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 Return the final sentence representing the conversion from S to Goat Latin.



 Example 1:

 Input: "I speak Goat Latin"
 Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 Example 2:

 Input: "The quick brown fox jumped over the lazy dog"
 Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"


 Notes:

 S contains only uppercase, lowercase and spaces. Exactly one space between each word.
 1 <= S.length <= 150.

 */
public class ToGoatLatin {

    String vowels = "aeiou";

    public String toGoatLatin(String S) {
        String[] allWords = S.split(" ");
        String[] goatLatinArr = new String[allWords.length];
        int index = 0;
        for (String word : allWords) {
            if (beginsWithVowel(word)) {
                word = word + "ma";
            } else {
                word = word.substring(1, word.length()) + word.substring(0, 1) + "ma";
            }
            for (int i = 0; i <= index; i++) {
                word = word + "a";
            }
            goatLatinArr[index] = word;
            index++;
        }
        return String.join(" ", goatLatinArr);

    }

    private boolean beginsWithVowel(String word) {
        String wordToTest = word.toLowerCase();
        char firstLetter = wordToTest.charAt(0);
        if (vowels.indexOf(firstLetter) >= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ToGoatLatin().toGoatLatin("I speak Goat Latin"));
    }
}
