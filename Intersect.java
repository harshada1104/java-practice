import java.util.ArrayList;

public class Intersect {



    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    // avoid duplicates
                    if (!list.contains(nums1[i])) {
                        list.add(nums1[i]);
                    }
                    break; // no need to keep checking nums2 once match found
                }
            }
        }

        // convert list to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }


}
