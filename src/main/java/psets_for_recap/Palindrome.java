package psets_for_recap;


public class Palindrome {

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome("abdrba"));
    }

    private String reverse1(String toReverse) {
        int len = toReverse.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            stringBuilder.append(toReverse.charAt(i));
        }
        return stringBuilder.toString();
    }

    private boolean isPalindrome(String toCheck) {
        return toCheck.equals(reverse1(toCheck));
    }
}
