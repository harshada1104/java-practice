public class SingleNumber {
    
    public static void main(String[] args) {
        int nums []={4,1,2,1,2};
       single(nums);

    }

    public static void single(int nums[]){
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
      System.err.println(result);

        
    }
}
