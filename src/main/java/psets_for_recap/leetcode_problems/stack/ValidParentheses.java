package psets_for_recap.leetcode_problems.stack;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        int len = s.length();
        String openers = "({[";
        for (int i = 0; i < len; i++) {
            char ch = s.toCharArray()[i];
            if (openers.indexOf(ch) >= 0) {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    valid = false;
                    return valid;
                } else {
                    char opening = stack.pop();
                    if (!isCorresponding(opening, ch)) {
                        valid = false;
                        return false;
                    }
                }
            }
        }
        if (!stack.empty()) return false;
        return valid;

    }

    private boolean isCorresponding(char open, int close) {
        String openers = "({[";
        String closers = ")}]";
        return openers.indexOf(open) == closers.indexOf(close);
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("(]"));
    }
}
