package PracticeDSA;

public class MinimumNoInRoated {
    public static int minimumarray(int arr[]){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int low = 0,high=n-1;
        while(low<=high){
            int mid= (low+high)/2;
        if(arr[low]<=arr[mid]){
            ans = Math.min(ans, arr[low]);
            low=mid+1;
        }else{
            ans=Math.min(ans, arr[mid]);
            high= mid-1;
        }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr []={4,5,6,1,2};
        int result = minimumarray(arr);
        System.out.println(result);
    }
}
