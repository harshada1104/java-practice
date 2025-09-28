package PracticeDSA;

public class MinimumRoated {
    public static void sorted(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
             if(arr[i]<arr[i+1]){
                 
             }else{
        
                System.out.println("Not sorted");
                       
             }
         
        }
        System.out.println("sorted");
    }

    public static void main(String[] args) {
        int arr[]= {1,5,2,3,4,5};
        sorted(arr);
    }
}
