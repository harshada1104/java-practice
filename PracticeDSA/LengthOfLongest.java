package PracticeDSA;

public class LengthOfLongest {
    public static int longest(int arr[],long k){
        int n = arr.length;//storing the size of the array
        int large = 0;//storing the largest length as o
       for(int i =0;i<n;i++){
           long s = 0;//storing the sum of substrings
           for(int j = i;j<n;j++){
            s += arr[j];//adding
             if(s == k){
                large = Math.max(large,j-i+1);//comparing
             }
           }
       } 
       return large;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = longest(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
