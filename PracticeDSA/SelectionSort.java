package PracticeDSA;

public class SelectionSort {
    public static void selection(int arr[]){
        int n = arr.length;//storing the length of the array
        for(int i = 0;i<arr.length;i++){
            int minIndex = i;//assuming index of the  minimum element as first element of the array
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;//allocting the minimum index
                }

                int temp = arr[minIndex];//swaping the elements
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
    }

     public static void main(String[] args) {
        int[] arr = {5,2,3,1};
        selection(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
