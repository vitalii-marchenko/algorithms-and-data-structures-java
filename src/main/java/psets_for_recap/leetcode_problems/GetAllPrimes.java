package psets_for_recap.leetcode_problems;

import java.util.ArrayList;
import java.util.List;

public class GetAllPrimes {

    private List<Integer> getAllPrimes(int boundary) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i <= boundary; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }


    public static void main(String[] args) {
        new GetAllPrimes().getAllPrimes(100);
    }
}
