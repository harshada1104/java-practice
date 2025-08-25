public class Longest {

    public static void main(String[] args) {
        int array[] = {0,3,7,2,5,8,4,6,0,1};
        greater(array);
    }

    public static void greater(int array[]) {
        // Step 1: Sort the array
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Step 2: Count longest consecutive sequence
        int currentCount = 1; // each number is at least a sequence of length 1
        int maxCount = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i+1] == array[i] + 1) {
                // consecutive element
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } 
            else if (array[i+1] != array[i]) { 
                // reset if gap (avoid duplicate handling)
                currentCount = 1;
            }
        }

        System.out.println("Longest consecutive sequence length = " + maxCount);
    }
}
