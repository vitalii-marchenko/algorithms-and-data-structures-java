package l03_nod;

public class GDCWithoutRecursion {

    private int gdc(int a, int b) {
        System.out.println(a + " " + b);
        while (true) {
            if (a == 0) return b;
            if (b == 0) return a;
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
     }

    public void run() {
        System.out.println(gdc(1141 * 1353, 1141 * 34));
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new GDCWithoutRecursion().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
