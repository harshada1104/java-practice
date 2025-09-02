package Strings1;

public class Maxima {
    public static void main(String[] args) {
       
        String s = "Hello World";
        max(s);
    }

    public static void max(String s) {
         
int count = 0;

for (int i = s.length() - 1; i >= 0; i--) {
    // Skip trailing spaces (if any)
    if (s.charAt(i) == ' ' && count == 0) {
        continue;
    }
    
    // Stop once we reach the space before the last word
    if (s.charAt(i) == ' ' && count > 0) {
        break;
    }

    // Print characters of the last word
    System.out.print(s.charAt(i));
    count++;
}

System.out.println("\nCount = " + count);


    }
}
