package Strings1;

import java.util.*;

public class Word {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                map.put(c, word);
            }

            if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != c) {
                    return false;
                }
            } else {
                reverseMap.put(word, c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        boolean result = wordPattern(pattern, s);
        System.out.println("Pattern matches? " + result);
    }
}
