package psets_for_recap;


public class ReverseString {

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverse1("Hello!"));
        System.out.println(new ReverseString().reverse2("Hello!"));
    }

    private String reverse1(String toReverse) {
        int len = toReverse.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            stringBuilder.append(toReverse.charAt(i));
        }
        return stringBuilder.toString();
    }

    private String reverse2(String toReverse) {
        String reversed = "";
        for (Character character : toReverse.toCharArray()) {
            reversed = character + reversed;
        }
        return reversed;
    }
}
