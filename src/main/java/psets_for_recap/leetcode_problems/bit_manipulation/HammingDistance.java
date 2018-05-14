package psets_for_recap.leetcode_problems.bit_manipulation;

public class HammingDistance {

    /**
     *
     The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

     Given two integers x and y, calculate the Hamming distance.

     Note:
     0 ≤ x, y < 231.

     Example:

     Input: x = 1, y = 4

     Output: 2

     Explanation:
     1   (0 0 0 1)
     4   (0 1 0 0)
     ↑   ↑

     The above arrows point to positions where the corresponding bits are different.
     */

    public int hammingDistance(int x, int y) {
        int res = 0;
        String x_binary = convertToBinary(x);
        String y_binary = convertToBinary(y);
        int zerosToAdd = 0;
        if (x > y) {
            zerosToAdd = x_binary.length() - y_binary.length();
            for (int i = 0; i < zerosToAdd; i++) {
                y_binary = "0" + y_binary;
            }
        } else {
            zerosToAdd = y_binary.length() - x_binary.length();
            for (int i = 0; i < zerosToAdd; i++) {
                x_binary = "0" + x_binary;
            }
        }

        for (int i = 0; i < x_binary.length(); i++) {
            if (x_binary.charAt(i) != y_binary.charAt(i)) {
                res += 1;
            }
        }
        return res;
    }

    private String convertToBinary(int num) {
        String res = "";
        while (num > 0) {
            res = (num % 2) + res;
            num /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        new HammingDistance().hammingDistance(1, 4);
    }
}
