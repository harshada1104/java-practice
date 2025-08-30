public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // last index of nums1's valid elements
        int j = n - 1; // last index of nums2
        int k = m + n - 1; // last index of nums1 (total size)

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    // main method for testing
    public static void main(String[] args) {
        Merge obj = new Merge();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        obj.merge(nums1, m, nums2, n);

        // print merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}

