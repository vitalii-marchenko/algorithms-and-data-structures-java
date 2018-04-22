package l02_fib;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    Map<Integer, BigInteger> cache = new HashMap<Integer, BigInteger>();

    int cnt;

    // StackOverflowError when n = 10 000
    private BigInteger fibonacci(int n) {
        cnt++;
        if (n < 2) {
            return BigInteger.valueOf(n);
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            BigInteger res = fibonacci(n - 1).add(fibonacci(n - 2));
            cache.put(n, res);
            return res;
        }
    }

    private BigInteger fibonacciWithLoop(int n) {
        cnt++;
        if (n < 2) {
            return BigInteger.valueOf(n);
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            for (int i = 2; i <= n; i++) {
                BigInteger res = fibonacciWithLoop(i - 1).add(fibonacciWithLoop(i - 2));
                cache.put(i, res);
            }
            return cache.get(n);
        }
    }

    private void run(int n) {
        System.out.println(n + " : " + fibonacci(n));
        System.out.println(cnt + " recursive calls");

        System.out.println("==============");
        System.out.println(n + " : " + fibonacciWithLoop(n));
        System.out.println(cnt + " recursive calls");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Fibonacci().run(5);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");

    }
}
