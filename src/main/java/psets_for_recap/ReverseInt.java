package psets_for_recap;


public class ReverseInt {

    public static void main(String[] args) {
        System.out.println(new ReverseInt().reverseInt1(-51));
        System.out.println(new ReverseInt().reverseInt2(-5178));
    }

    private int isDeviderOfTen(int n) {if (n % 10 == 0) {
            while (n > 9) {
                n /= 10;
            }
        }
        return n;
    }

    private int reverseInt1(int toReverse) {
        String strRepresentation = String.valueOf(toReverse);
        String res = "";
        if (toReverse < 0) {
            res += "-";
        }
        int len = strRepresentation.length();
        for (int i = len - 1; i >= 0; i--) {
            if (String.valueOf(strRepresentation.charAt(i)).equals("-")) {
                continue;
            }
            res += strRepresentation.charAt(i);
        }
        return Integer.valueOf(res);
    }

    private int reverseInt2(int toReverse) {
        boolean isNegative = false;
        if (toReverse < 0) {
            isNegative = true;
            toReverse *= -1;
        }
        String res = "";
        while (toReverse > 0) {
            res += String.valueOf(toReverse % 10);
            toReverse /= 10;
        }
        if (isNegative) {
            return Integer.valueOf(res) * (-1);
        } else {
            return Integer.valueOf(res);
        }
    }
}
