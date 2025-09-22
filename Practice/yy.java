package Practice;

import java.util.Stack;

public class yy {
    public static void main(String[] args) {
        String s = "hello";
        reverse(s);

    }

    public static void reverse(String s) {
        Stack<Character> stack1 = new Stack<>();

        for (char ch : s.toCharArray()) {

            stack1.push(ch);
            

        }
        for (int i = 0; i < s.length(); i++) {
                System.out.print(stack1.pop());
            }

    }
}
