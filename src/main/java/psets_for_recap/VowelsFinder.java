package psets_for_recap;

public class VowelsFinder {

    String vowels = "aeuoi";

    public int countVowels(String s) {
        int res = 0;
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) >= 0) {
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new VowelsFinder().countVowels("jnsfdksfse"));
    }
}
