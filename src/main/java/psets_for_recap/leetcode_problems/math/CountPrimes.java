package psets_for_recap.leetcode_problems.math;

public class CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes2(int n) {
        // first index - 0, last index - n-1;
        boolean[] arr = new boolean[n];
        for (int i = 2; i < n; i++) {
            arr[i] = true;
        }

        for (int p = 2; p * p < n; p++) { // or p<=Math.sqrt(n)
            if (!arr[p]) {
                continue;
            }
            for (int i = p * p; i < n; i += p) { // or i=p*p + i*p => i=p*(i+p), or for (int j = i * i; j < n; j += i)
                arr[i] = false;
            }
        }
        int cnt = 0;
        for (int i = 2; i < n; i++)
            if (arr[i]) {
                cnt++;
            }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes2(499979));
    }
}
