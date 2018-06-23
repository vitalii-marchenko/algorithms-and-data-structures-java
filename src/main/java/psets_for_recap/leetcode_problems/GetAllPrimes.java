package psets_for_recap.leetcode_problems;

import java.util.ArrayList;
import java.util.List;

public class GetAllPrimes {

    private List<Integer> getAllPrimes(int boundary) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= boundary; i++) {
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

    public static String fromTenToBinary(int n) {
        String res = "";
        while (n > 0) {
            res = (n % 2) + res;
            n /= 2;
        }
        return res;
    }


    public static void main(String[] args) {
        new GetAllPrimes().getAllPrimes(100);
        fromTenToBinary(55);
    }
}
