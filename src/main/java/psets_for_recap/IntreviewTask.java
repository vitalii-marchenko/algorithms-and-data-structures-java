package psets_for_recap;

public class IntreviewTask {
//
//    A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
//    example: madam
//            testdata

        public void runTest() {
        String[] itemA = {"madam", "a", "", "ab", "java", "aba", "maddam", "IliveInCity", "IliveInCit"};
        for (int i = 0; i < itemA.length; i++) {
        System.out.println(itemA[i] + " : " + isPalindrome(itemA[i]));

            }
        }

        public boolean isPalindrome(String word) {
            StringBuilder builder = new StringBuilder();
            int len = word.length();
            if (len == 0) return false;
            for (int i = len - 1; i >= 0; i--) {
                builder.append(word.charAt(i));
            }
            return builder.toString().equals(word);
        }


    public static void main(String[] args) {
        new IntreviewTask().runTest();
    }




}
