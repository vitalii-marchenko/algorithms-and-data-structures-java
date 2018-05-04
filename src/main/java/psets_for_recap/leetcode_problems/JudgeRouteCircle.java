package psets_for_recap.leetcode_problems;

public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        int res = 0;
        boolean isCircle = false;
        for (Character ch : moves.toCharArray()) {
            if (ch == 'R') {
                res += 1;
            } else if (ch == 'L') {
                res -= 1;
            } else if (ch == 'U') {
                res += 2;
            } else {
                res -= 2;
            }
        }
        isCircle = res == 0;
        return isCircle;
    }

    public static void main(String[] args) {
        System.out.println(new JudgeRouteCircle().judgeCircle("UD"));
        System.out.println(new JudgeRouteCircle().judgeCircle("LL"));
    }
}
