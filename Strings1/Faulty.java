package Strings1;

import java.util.Stack;

public class Faulty {

    public static void main(String[] args) {
        String s = "String";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {

                char q = st.pop(); // pop once

                System.out.println(q);

                

            }

        }
    }
}
