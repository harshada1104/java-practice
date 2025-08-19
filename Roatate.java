public class Roatate {

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

        roatate(array, k);

    }

    public static void roatate(int array[], int k) {

        for (int i = 1; i <= k; i++) {
            int temp = array[array.length - 1];
            for (int e = array.length - 1; e > 0; e--) {

                array[e] = array[e - 1];

            }

            array[0] = temp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
