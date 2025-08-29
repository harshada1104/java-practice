import java.util.*;

public class Romoan {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.romanToInt("III"));      // 3
        System.out.println(sol.romanToInt("IV"));       // 4
        System.out.println(sol.romanToInt("IX"));       // 9
        System.out.println(sol.romanToInt("LVIII"));    // 58
        System.out.println(sol.romanToInt("MCMXCIV"));  // 1994
    }
}

class Solution {
    public int romanToInt(String s) {
        // Mapping of Roman numerals to values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Loop from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = map.get(s.charAt(i));

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
    }
}
