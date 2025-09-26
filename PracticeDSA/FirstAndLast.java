package PracticeDSA;

public class FirstAndLast {

    // Brute force approch using linear search taking time as O(n)
    public static void firstandlast(int arr[], int x) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                    last = i;
                }
                last = i;
            }
        }
        System.out.println(first + " " + last);
    }

    // optimized approch using binary search
    public static int solve(int n, int key, int v[]) {
        int start = 0;
        int end = n - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (v[mid] == key) {
                res = mid;
                start = mid + 1;

            } else if (key < v[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 8, 8, 8, 9 };
        int x = 8;
        int n=arr.length;

        firstandlast(arr, x);
System.out.println(solve(n,x,arr));
    }
}
