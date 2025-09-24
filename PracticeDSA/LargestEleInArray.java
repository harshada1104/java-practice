package PracticeDSA;

public class LargestEleInArray {

    // Brute force
    public static void largest(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println(arr[n - 1]);
    }

    // optimal appoarch
    public static void largestoptimal(int arr[]) {
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 9, 4, 2 };
        largest(arr);
        largestoptimal(arr);
    }
}
