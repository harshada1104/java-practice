import java.util.Scanner;//for the input

public class Hashing3
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scannner class is there to get the input from the user

        // Input size of array
        int n = sc.nextInt();
        int[] arr = new int[n];//creating a new array

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequency
        int[] hash = new int[13]; // size 13 like in your C++ code
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;//so here the array was initialized as 0 then we gradually increase the no
        }

        // Number of queries
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            // Fetch frequency & print
            System.out.println(hash[number]);
        }

        sc.close();
    }
}
