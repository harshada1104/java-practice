package Strings1;

public class Plaindrame {

     public static void main(String[] args) {
     

        // Test cases
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "No lemon, no melon";

    isPalindrome(s1); // true
      
    }
    public static void isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            System.out.println("flase");
            }
            left++;
            right--;
        }
       System.out.println("true");
    }


}
