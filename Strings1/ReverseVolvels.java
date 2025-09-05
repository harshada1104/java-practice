package Strings1;

import java.util.Stack;

public class ReverseVolvels {
    public static void main(String[] args) {
        String s = "IceCream";
        String lower = s.toLowerCase();
        reverseVolvels(lower);
    }

    public static void reverseVolvels(String s) {
        Stack<Character> stack1 = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                stack1.push(s.charAt(i));
            }

        }
      for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' 
        || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
        
        char q = stack1.pop();      // pop once
        sb.setCharAt(i, q);         // replace with that char
    }
}

      System.out.println(sb.toString());

    }
}
