package Strings1;

import java.util.Stack;

public class Valid {
    public static void main(String args[]) {
        String s = "[]";
        validParenthesis(s);
    }

    public static void validParenthesis(String s) {
        // here lets use stack
         Stack<Character> stack1 = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch == '(' || ch=='{' || ch=='[' ){
                stack1.push(ch);
            }else{
                if(stack1.isEmpty()){
                    System.out.println("donne");
                }
                 char top = stack1.pop();
                 if (ch == ')' && top != '(') {
                   System.out.println("wrong");
                }
                if (ch == ']' && top != '[') {
                       System.out.println("wrong");
                }
                if (ch == '}' && top != '{') {
                      System.out.println("wrong");
                }
            }
            if(stack1.isEmpty()){
                System.out.println("good");
            }
        }
    }
}
