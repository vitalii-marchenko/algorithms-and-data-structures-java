package l03_nod;

public class GDCPrimitive {

    private int gdc(int a, int b) {
        int result = 0;
        for (int i = 1; i < Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public void run() {
        System.out.println(gdc(1141 * 1353, 1141 * 34));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new GDCPrimitive().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
