import java.util.Arrays;

public class Missingno {

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };

        missing(nums);

    }

    public static  int missing(int nums[]) {
       int n = nums.length;//storing the length of the arary
       int []v=new int [n+1];//new array with +1 size of n means creating a space for the missing no too
       Arrays.fill(v, -1);//here filling the array name v with all -1
       for(int i = 0 ; i<nums.length;i++){//stating the loop
        v[nums[i]]=nums[i];//For nums[0] = 3 → v[3] = 3 → v = [-1, -1, -1, 3] this is allocated the number to the proper index place for eg if 3 then it will go to index 3 of v

       }
       for(int i = 0;i<v.length;i++){
        if(v[i]==-1){//checking the array if it contain -1 the return the no index
            System.out.println(i);
        }
       }
       return 0;
    }
}
