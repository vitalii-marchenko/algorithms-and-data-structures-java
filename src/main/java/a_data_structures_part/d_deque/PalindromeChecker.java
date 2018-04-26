package a_data_structures_part.d_deque;


public class PalindromeChecker {

    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        Deque deque = new Deque();
        for (Character c : s.toCharArray()) {
            deque.addRear(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeRear().equals(deque.removeFront())) {
                isPalindrome = false;
                return isPalindrome;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeChecker().isPalindrome("radar"));
    }
}
