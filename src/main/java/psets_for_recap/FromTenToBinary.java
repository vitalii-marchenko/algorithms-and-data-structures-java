package psets_for_recap;


public class FromTenToBinary {

    public String toBinary(int num) {
        String res = "";
        while (num > 0) {
            res = (num % 2) + res;
            num /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new FromTenToBinary().toBinary(42));
    }
}
