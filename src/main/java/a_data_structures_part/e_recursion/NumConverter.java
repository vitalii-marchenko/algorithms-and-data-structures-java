package a_data_structures_part.e_recursion;

import java.util.Arrays;
import java.util.List;

public class NumConverter {

    List<String> nums  = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

    public String convertNum(int num) {
        String res = "";
        while (num > 0) {
            int n = num % 10;
            num /= 10;
            res =  nums.get(n) + res;
        }
        return res;
    }

    public String convertNumRecursevly(int num) {
        String res = "";
        if (num <= 9) {
            return nums.get(num);
        } else {
            res = convertNumRecursevly(num / 10) + nums.get(num % 10);
        }
        return res;
    }

    public String convertNumRecursevlyWithBase(int num, int base) {
        String res = "";
        if (num < base) {
            return nums.get(num);
        } else {
            res = convertNumRecursevlyWithBase(num / base, base) + nums.get(num % base);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new NumConverter().convertNum(56789));
        System.out.println(new NumConverter().convertNumRecursevly(56789));
        System.out.println(new NumConverter().convertNumRecursevlyWithBase(56789, 10));
    }
}
