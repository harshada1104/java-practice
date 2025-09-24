package PracticeDSA;

public class SecondLargestEle {

    // Brute method
    public static void second(int arr[]) {
        int n = arr.length;
        int secondLar = 0;
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
        for (int k = n - 2; k >= 0; k--) {
            if (arr[k] != arr[n - 1]) {
                secondLar = arr[k];
                break;
            }
        }

        System.out.println(secondLar);

    }
    // optimal

    public static void secondoptimal(int arr[]) {
        int largest = arr[0];
        int secondlargeest = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] > secondlargeest && arr[j] != largest) {
                secondlargeest = arr[j];

            }
        }
        System.out.println(secondlargeest);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 4, 8, 3, 2 };

        second(arr);
        secondoptimal(arr);
    }
}
