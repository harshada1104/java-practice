package Strings1;

public class LargestOdd {
   public static void main(String[] args) {

      String s = "52";
      int num = Integer.parseInt(s);
      int max = 0;

      for (int i = 0; i < s.length(); i++) {
         int m = num % 10;   // get last digit
         if (m % 2 == 1 && m > max) {  // check if odd and larger than current max
            max = m;
         }
         num = num / 10;     // move to next digit
      }

      System.out.println(max);
   }
}
