package Strings1;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "hello";
        String m = "meyty";

        iso(s, m);
    }

    public static void iso(String s, String m) {
        if (s.length() != m.length()) {
            System.out.println("no"); // lengths differ → not isomorphic
            return;
        }

        HashMap<Character, Character> hm = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = m.charAt(i);

            if (hm.containsKey(ch1)) {
                if (hm.get(ch1) != ch2) {
                    System.out.println("no");
                    return;
                }
            } else if (hm.containsValue(ch2)) {
                System.out.println("no");
                return;
            }

            hm.put(ch1, ch2);
        }

        System.out.println("wow"); // isomorphic
    }
}
