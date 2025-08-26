public class ContainsDup {
    public static void main(String[] args) {
        
        int nums[]={1,2,3,4};
         containsDuplicate(nums);
        
    }
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
        return false;
    }
}
