public class Sum {

    public static void main(String[] args) {
        int array[] = { 3, 3 };
        sum(array, 6);

    }

    public static void sum(int array[], int target) {
        for (int i = 0; i < array.length; i++) {
            // System.out.println("ye hai first loop" + i);
            int temp = 0;
            int postion[] = new int[2];

            if (array[i] < target) {
                temp = array[i];
            }
            // System.out.println("ye hai output of temp" + temp);
            for (int j = i + 1; j < array.length; j++) {
                // System.out.println("ye hai second loop" + j);
                if (array[j] < target) {
                    int sum = temp + array[j];
                    if (sum == target) {
                        postion[0] = j;
                        postion[1] = i;
                    }

                    System.out.println(sum);
                    for (int k = 0; k < postion.length; k++) { // ✅ correct
                        System.out.print(postion[k] + " ");
                    }

                }
            }
        }

    }
}
