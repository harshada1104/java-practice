package Strings1;

public class LongestPlandrome {
    public static void main(String[] args) {
        String m = "abab";
        int start = 0;   // store beginning index of longest palindrome
        int maxLen = 1;  // at least 1 char is palindrome

        for (int i = 0; i < m.length(); i++) {
            for (int j = i; j < m.length(); j++) {
                int left = i, right = j;
                boolean isPal = true;

                // check if substring m[i..j] is palindrome
                while (left < right) {
                    if (m.charAt(left) != m.charAt(right)) {
                        isPal = false;
                        break;
                    }
                    left++;
                    right--;
                }

                // if palindrome and longer than previous best
                if (isPal && (j - i + 1 > maxLen)) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }

        // print longest palindromic substring
        System.out.println(m.substring(start, start + maxLen));
    }
}
