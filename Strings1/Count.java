package Strings1;

public class Count {
    public static void main(String[] args) {
        String[] words = {"hey", "aeo", "mu", "ooo", "artro"};
        int left = 0;
        int right = 4;
        letter(words, left, right);
    }

    public static void letter(String[] words, int l, int right) {
        int count = 0;

        for (int i = l; i <= right; i++) {
            String word = words[i];
            // Check if word starts with a vowel
            if (word.startsWith("a") || word.startsWith("e") ||
                word.startsWith("i") || word.startsWith("o") ||
                word.startsWith("u")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
