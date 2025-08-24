public class RearrangeEle {
    public static void main(String[] args) {
        int array[] = {3, 1, -2, -2, 5, -4};
        rearrangeAlternate(array);
    }

    public static void rearrangeAlternate(int array[]) {
        int n = array.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;

        // Separate positives and negatives
        for (int x : array) {
            if (x >= 0) pos[p++] = x;
            else neg[q++] = x;
        }

        int i = 0, pi = 0, ni = 0;

        // Fill alternately (positive first)
        while (pi < p && ni < q) {
            array[i++] = pos[pi++];
            array[i++] = neg[ni++];
        }

        // Add remaining positives
        while (pi < p) array[i++] = pos[pi++];

        // Add remaining negatives
        while (ni < q) array[i++] = neg[ni++];

        // Print result
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}
