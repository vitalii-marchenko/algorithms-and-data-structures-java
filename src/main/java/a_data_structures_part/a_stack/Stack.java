package a_data_structures_part.a_stack;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private List<Object> stack;

    public Stack() {
        stack = new ArrayList<Object>();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(Object item) {
        stack.add(item);
    }

    public Object peek() {
        return stack.get(stack.size() - 1);
    }

    public Object pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        throw new EmptyStackException();
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                '}';
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.size());
        stack.push(4);
        stack.push("string");
        stack.push(true);
        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
    }
}
