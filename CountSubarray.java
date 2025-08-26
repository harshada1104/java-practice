public class CountSubarray {

    public static void main(String[] args) {
        int array[] = { 3, 1, 2, 4 };
        int k = 6;
        count(array, k);
    }

    public static int count(int array[], int k) {
        int counts = 0;
        for (int i = 0; i < array.length; i++) {
                           for (int j = i; j < array.length; j++) {
                    int sum = 0;
                    for (int e = i; e <= j; e++) {
                        sum += array[e];
                        if (sum == k) {
                            counts++;

                        }
                    }

          
            }
            
             
        }
        System.out.println(counts);
             return counts;
    }
}
