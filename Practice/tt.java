package Practice;

public class tt {
    public static void main(String[] args) {
        int array[] = { 2, 7, 11, 15 };
        int target = 9;
        sums(array, target);
    }

    public static int[] sums(int array[], int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum > target) {
                right--;

            } else {
                left++;
            }
        }
        return new int[] { -1, -1 };
    }

}
