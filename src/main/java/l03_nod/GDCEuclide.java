package l03_nod;

public class GDCEuclide {

    private int gdc(int a, int b) {
        System.out.println(a + " " + b);
        if (a == 0) return b;
        if (b == 0) return a;

        if (a > b) {
            return gdc(a % b, b);
        } else {
            return gdc(a,b % a);
        }
    }

    public void run() {
        System.out.println(gdc(1141 * 1353, 1141 * 34));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new GDCEuclide().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
