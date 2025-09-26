package PracticeDSA;

public class RotatedSortedArray {
    public static int search(int arr[],int n,int x){
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=x && x<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]<=x && x<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={7,8,9,1,2,3,4,5,6};
        int n = arr.length;
        int x = 1;
       int result = search(arr, n, x);  
        System.out.println(result);
    }
}
