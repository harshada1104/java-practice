import java.util.Scanner;

public class Hashing4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        String s = sc.next();

        // Precompute frequency of each character
        int[] hash = new int[256]; // supports all ASCII characters if we need just the small case then we can do 'ch'-a
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        // Number of queries
        int q = sc.nextInt();
        while (q-- > 0) {
            char c = sc.next().charAt(0); // read single character
            // Fetch and print frequency
            System.out.println(hash[c]);
        }

        sc.close();
    }
}
