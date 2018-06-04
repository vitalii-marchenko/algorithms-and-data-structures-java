package psets_for_recap;

public class PossibleTriangle {

    public boolean isValidTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new PossibleTriangle().isValidTriangle(5, 5, 5));
    }
}
