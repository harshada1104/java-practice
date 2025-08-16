public class SelectionSort {

    public static void main(String[] args) {
        int array[] = { 8, 7, 9, 2, 1, 5, 6, 4 };// initalizing the array
        selectionSort(array);

        for (int i : array) {// for loop to go through each element of the array
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {// creating the function for sorting
        for (int i = 0; i < array.length - 1; i++) {// first loop which will loop through entire array
            int min = i;// for now it will store the current element in this min varible
            for (int j = i + 1; j < array.length; j++) {// second loop which will do the work of comparing
                if (array[min] > array[j]) {// if the current min is greater than current no in the second loop then
                                            // replace the current as min
                    min = j;// replacing
                }
            }

            int temp = array[i];//logic for swaping
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
