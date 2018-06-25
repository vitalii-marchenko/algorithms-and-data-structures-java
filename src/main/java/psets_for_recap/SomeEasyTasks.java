package psets_for_recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SomeEasyTasks {

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String reverseStringIterate(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }

    public String StringreverseStringIterBuilder(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    public boolean isPerfectSquare(int num) {
        int start = 1;
        boolean isPef = true;
        int guess = start * start;
        while (guess != num && isPef) {
            if (guess > num) {
                isPef = false;
            }
            start++;
            guess = start * start;
        }
        return isPef;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10 && i != 0) {
                res.add(i);
            } else {
                if (isSelfDividing(i)) {
                    res.add((i));
                }
            }
        }
        return res;
    }

    private boolean isSelfDividing(int i) {
        boolean isDividing = true;
        int myNum = i;
        while (i > 0 && isDividing) {
            int lastDigit = i % 10;
            if (lastDigit == 0) {
                isDividing = false;
            } else if (myNum % lastDigit != 0) {
                isDividing = false;
            } else {
                i /= 10;
            }
        }
        return isDividing;
    }

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (nums[j] == 0) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        System.out.println(nums);
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numbersCount = new HashMap<>();
        for (int n : nums) {
            if (numbersCount.containsKey(n)) {
                int val = numbersCount.get(n);
                numbersCount.put(n, val + 1);
            } else {
                numbersCount.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numbersCount.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if (value == 1) {
                return key;
            }
        }

        return -1;
    }

    public int nthPrime(int num) {
        int nth = 0;
        int start = 1;
        while (nth != num) {
            start++;
            if(isPrime(start)) {
                nth++;
            }
        }
        return start;
    }


    public boolean isPrime(int n) {
        for (int i = n; i <= n; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new SomeEasyTasks().reverseString("Hello World"));
        System.out.println(new SomeEasyTasks().reverseStringIterate("Hello World"));
        System.out.println(new SomeEasyTasks().StringreverseStringIterBuilder("Hello World"));
        System.out.println(new SomeEasyTasks().isPerfectSquare(14));
        System.out.println(new SomeEasyTasks().selfDividingNumbers(1, 22));
        int[] arr = {0,1,0,3,12};
        int[] arr2 = {4,1,2,1,2};
        new SomeEasyTasks().moveZeroes(arr);
        new SomeEasyTasks().singleNumber(arr2);
        new SomeEasyTasks().nthPrime(10001);
        new SomeEasyTasks().isPrime(10001);
    }
}
