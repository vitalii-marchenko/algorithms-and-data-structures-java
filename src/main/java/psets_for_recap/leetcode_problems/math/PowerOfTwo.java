package psets_for_recap.leetcode_problems.math;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        int power = 0;
        double start = 2.0;
        double res = 1;
        boolean isPower = true;
        while (res != n && isPower) {
            res = Math.pow(start, power);
            if (res > n) {
                isPower = false;
            }
            power++;
        }
        return isPower;
    }

    public static void main(String[] args) {
        System.out.println(new PowerOfTwo().isPowerOfTwo(16));
    }
}
