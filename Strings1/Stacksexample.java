package Strings1;

import java.util.Stack;

public class Stacksexample {
    public static void main(String[] args) {

        String s = "hello";
        Stack<Integer> stack = new Stack<>();// initializing a new stack

        // pushing or adding elements in the stack
        stack.push(10);// its an method to push in the stack
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println("top" + stack.peek());

        System.out.println(stack.pop());
        reverse(s);
    }

    public static void reverse(String s) {
        Stack<Character> stack1 = new Stack<>();// initializing a new stack

        for (int i = 0; i < s.length(); i++) {
            stack1.push(s.charAt(i));

        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack1.pop());

        }

    }
}
