public class Intersection {
    public static void main(String[] args) {
        int nums1 []={1,2,4,2,1};
        int nums2 []={2,2,4};
        intersection(nums1, nums2);
    }
    public static void intersection(int[] nums1, int[] nums2) {
        int no =0;
        for(int i=0;i<nums1.length;i++){
           
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   no++;
                  
                }
            }
        }
        System.out.println(no/2);
    }
}
