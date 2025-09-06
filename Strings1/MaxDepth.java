package Strings1;

public class MaxDepth {
    public static void main(String[] args) {
        String m = "((()))";
        int maxdepth = 0;
        int depth = 0;// counting

        for (char i : m.toCharArray()) {
            if (i == '(') {
                depth++;
                if (depth > maxdepth) {
                    maxdepth = depth;
                }
                else if(i == ')'){
                    depth--;
                }
            }
        }
        System.out.println(maxdepth);

    }
}
