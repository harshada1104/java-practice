public class InsertionSort {

    public static void main(String[] args) {
        int array[] = { 9, 7, 5, 3, 2, 1, 6, 8 };// initializing the array

        insertionSort(array);//calling the function
        for (int i : array) {
            System.out.println(i + " ");
        }

    }

    private static void insertionSort(int[] array) {//initailzing the function and passing the array as parameter
        for (int i = 1; i < array.length; i++) {//starting the 1st loop from the second element if the array till the last
            int temp = array[i];//storing the current element in the temp for comparison
            int j = i - 1;//j wil start from the pervious element of the i
            while (j >= 0 && array[j] > temp) {//it will go till  its greater than 0 and the element if j is greater than temp 
                array[j + 1] = array[j];//so basically here we are seeing the max and shifting it to the left as comparing 
                j--;//so here we are also comparing the pervious no till the condition is satisfied
            }
            ;
            array[j + 1] = temp;//now here we just simply replace the j ka next that is the greater by smaller

        }
    }
}
