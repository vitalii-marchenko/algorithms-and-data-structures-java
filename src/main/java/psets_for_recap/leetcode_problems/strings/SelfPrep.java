package psets_for_recap.leetcode_problems.strings;

import java.util.Arrays;
import java.util.List;

public class SelfPrep {

    public String reverse(String original) {
        StringBuilder reversed = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }
        return reversed.toString();
    }

    public boolean isPalindrome(String textToCheck) {
        StringBuilder stringBuilder = new StringBuilder(textToCheck);
        return stringBuilder.reverse().toString().equals(textToCheck);
    }

    public int countZerosInArray(int[] arr) {
        int numOfZeros = 0;
        for (Integer integer : arr) {
            if (integer == 0) {
                numOfZeros += 1;
            }
        }
        return numOfZeros;
    }

    public int countZerosInList(List<Integer> myList) {
        int numOfZeros = 0;
        for (Integer integer : myList) {
            if (integer == 0) {
                numOfZeros += 1;
            }
        }
        return numOfZeros;
    }

    public int countZerosInListWithStream(List<Integer> myList) {
        return (int) myList.stream()
                .filter((i) -> i == 0)
                .count();
    }

    public int countZerosInString(String phrase) {
        int res = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == '0') {
                res += 1;
            }
        }
        return res;
    }

    public int countZerosInStringStream(String phrase) {
        return (int) phrase
                        .chars()
                        .filter(i -> i == '0')
                        .count();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0 ,1 , 1, 0, 1, 0, 1};

        int count = (int) Arrays.stream(arr).filter(i -> i == 0).count();
        System.out.println("Count is: " + count);

    }
}
