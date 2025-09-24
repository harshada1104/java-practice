package PracticeDSA;

public class InsertionSort {
public static void insert(int arr[]){
    int n = arr.length;
    for(int i=1;i<n;i++){
        int key = arr[i];// Store the current element to be inserted
        int j = i-1;// Start comparing with the element just before 'key'

        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }

        arr[j+1]=key;
    }
}
public static void main(String[] args) {

        // Example unsorted array
        int[] arr = {5, 2, 4, 6, 1, 3};

        // Call the insertion sort method
        insert(arr);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {        // For each element in the array
            System.out.print(num + " "); // Print the element followed by a space
        }
    }
}
