package Practice;

public class jh {
    public static void main(String[] args) {
        int nums []={0,1,0,3,12};
        zero(nums);
        for(int i =0;i<nums.length;i++){
         System.out.print(nums[i]);
        }

    }

    public static void zero(int nums[]){
        int left =0;
        
        for(int right =0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
    }
}
