package l02_fib;

public class FibWithoutCache {

    private int fibonacci(int n) {
        int current = 0;
        int next = 1;
        for (int i = 0; i < n; i++) {
            int after = current + next;
            current = next;
            next = after;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(new FibWithoutCache().fibonacci(100));
    }
}
