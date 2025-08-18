public class LargestElement {

    public static void main(String[] args) {
        int array[] = { 3, 3, 0, 99, -40 };
        largestElement(array);
    }

    public static void largestElement(int[] array) {
        int large = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > large) {
                large = array[i];
            }

        }
        System.out.println(large);
    }
}
