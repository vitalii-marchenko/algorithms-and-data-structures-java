package psets_for_recap.leetcode_problems.strings;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        String [] strArr = s.split(" ");
        String [] resArr = new String[strArr.length];
        int index = 0;
        for (String word : strArr) {
            String myWord = "";
            for(Character ch : word.toCharArray()) {
                myWord = ch + myWord;
            }
            resArr[index] = myWord;
            index++;
        }
        return String.join(" ", resArr);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInString().reverseWords("Let's take LeetCode contest"));
    }
}
