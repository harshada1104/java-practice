package PracticeDSA;

public class LowerBound {
    public static int lower(int arr[],int x,int n){
        int low = 0,high=n-1;
        int ans = n;
        while(low<=high){
       
            int mid =(low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,6,8,9,2,2};
        int n = arr.length;
        int x = 3;
      int ind =  lower(arr, x, n);
                System.out.println("The lower bound is the index: " + ind );
    }
}
