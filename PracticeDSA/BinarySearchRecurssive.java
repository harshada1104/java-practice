package PracticeDSA;

public class BinarySearchRecurssive {
    public static int recurssive(int arr[], int low, int high, int x) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return recurssive(arr, low, mid - 1, x);

            } else {
                return recurssive(arr, mid+1, high, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int x = 50;

        int result = recurssive(arr, 0, arr.length - 1, x);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}