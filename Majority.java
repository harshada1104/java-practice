public class Majority {
    public static void main(String[] args) {
        int array[] = { 3, 3, 4 };
        int n = array.length;
        majority(array, n);

    }

    public static void majority(int nums[], int n) {
        int max= nums.length/2;
      
        int no = 0;
        for(int i =0;i<nums.length;i++){
              int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    no = nums[i];

                }
                
            }
              if(count>max){
                    System.out.println(no);
                };
        }
      
                

  
    }}