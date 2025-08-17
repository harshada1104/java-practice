public class MergeSort {

    public static void main(String[] args) {

        int[] array = { 8, 2, 5, 3, 4, 7, 6, 1 };// initializing the array

        mergeSort(array);// calling the function

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        } // proving a loop to go through each element of the array and then print it

    }

    private static void mergeSort(int[] array) {// this function is used to divide the array

        int length = array.length;// storing the length if the array
        if (length <= 1)
            return;// if already the array has only 1 element then no need to divide and just
                   // simply return

        int middle = length / 2;// so that then array can be divided into 2 halfs
        int[] leftArray = new int[middle];// here the size of the left array is equal to middle
        int[] rightArray = new int[length - middle];// remaning the size to right

        int i = 0;
        int j = 0;// initializing the start

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];// we are pushing the element from the original array to the left array
            } else {
                rightArray[j] = array[i];// else will put the rest in the right array
                j++;
            }
        }
        mergeSort(leftArray);// here we are calling it again so to divide it more further
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;// indice

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;

            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;

        }
    }// getting the elements together

}
