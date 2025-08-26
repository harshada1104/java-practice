public class Search {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 5, 6 };
        int target = 6;

 
        search(nums, target);
    }

    public static void search(int nums[], int target) {
        
               int news =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
            } 
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]<target){
                news= i+1;
            }
        }

    }
}
