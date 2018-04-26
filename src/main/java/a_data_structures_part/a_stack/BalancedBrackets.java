package a_data_structures_part.a_stack;


public class BalancedBrackets {

    private boolean isBalanced(String brackets) {
        boolean balanced = true;
        int index = 0;
        Stack stack = new Stack();
        while (index < brackets.length() && balanced) {
            char symbol = brackets.toCharArray()[index];
            if (symbol == '(') {
                stack.push(symbol);
            } else {
                if (stack.isEmpty()) {
                    balanced = false;
                } else {
                    stack.pop();
                }
            }
            index++;
        }
        if (balanced && stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new BalancedBrackets().isBalanced("(()")  );
        System.out.println(new BalancedBrackets().isBalanced("((()))")  );
    }
}
