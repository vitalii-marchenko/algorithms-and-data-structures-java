package psets_for_recap;

public class CapitalizeEveryLetter {

    public String capitalize(String sent) {
        String[] words = sent.split(" ");
        int index = 0;
        for (String word : words) {
            word = word.substring(0, 1).toUpperCase() +
                    word.substring(1, word.length());
            words[index] = word;
            index++;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(new CapitalizeEveryLetter().capitalize("a lazy fox!"));
    }
}
