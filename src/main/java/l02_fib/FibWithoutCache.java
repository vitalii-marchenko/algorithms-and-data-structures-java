package l02_fib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    private int fibAnotherLoopSolution(int n) {
        List<Integer> result = new ArrayList<Integer>(Arrays.asList(0,1));
        for (int i = 2; i <= n; i++) {
            int prev = result.get(i - 2);
            int cur = result.get(i - 1);
            int next = cur + prev;
            result.add(next);
        }
        return result.get(n);
    }

    public static void main(String[] args) {
        System.out.println(new FibWithoutCache().fibonacci(100));
        System.out.println(new FibWithoutCache().fibAnotherLoopSolution(8));
    }
}
