public class QuickSort {

    public static void main(String[] args) {

        int[] array = { 8, 2, 5, 3, 4, 7, 6, 1 };// initializing the array

        quickSort(array, 0, array.length - 1);// calling the function here 0 is the begining and length-1 is the ending

        for (int i : array) {
            System.out.println(i + " ");
        } // proving a loop to go through each element of the array and then print it

    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start)
            return;// base case where we cannot divide the array further and return

        int pivot = partiton(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partiton(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;// the pivot
    }

}
