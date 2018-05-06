package psets_for_recap.leetcode_problems;


public class RotatedDigits {

    public int rotatedDigits(int N) {
        int numOfGoodDigits = 0;
        for (int i = 1; i <= N; i++) {
            String num = String.valueOf(i);
            if (isGoodNumber(num)) {
                numOfGoodDigits += num.length();
            }
        }
        return numOfGoodDigits;
    }

    private boolean isGoodNumber(String num) {
        for (Character ch : num.toCharArray()) {
            if (ch != '2' && ch != '5' && ch != '6' && ch != '9' && ch != '0' && ch != '1' && ch != '8') {
                return false;
            }
        }
        if (num.contains(String.valueOf('0')) || num.contains(String.valueOf('1')) || num.contains(String.valueOf('8'))) {
            return hasChangingFactor(num);
        } else {
            return true;
        }


    }

    private boolean hasChangingFactor(String num) {
        if (num.contains(String.valueOf('2')) || num.contains(String.valueOf('5'))
                || num.contains(String.valueOf('6')) || num.contains(String.valueOf('9'))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new RotatedDigits().rotatedDigits(10));
    }
}
