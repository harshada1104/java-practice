public class Parentesis {
    public  void main(String[] args) {
        String s ="(()())(())";
         removeOuterParenthesesString(s);
    }
   
    public String removeOuterParenthesesString(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (open > 0) { // not the outermost
                    result.append(c);
                }
                open++;
            } else { // ')'
                open--;
                if (open > 0) { // not the outermost
                    result.append(c);
                }
            }
        }

        return result.toString();
    }


}
