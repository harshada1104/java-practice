public class Union {
   
    public static void main(String[] args) {
        int array[]={1,2,5,4,5};
        int array2[]={2,3,4,4,5};
        int n=5;
        int m=5;
        union(array, array2, n, m);

    }
    public static void union(int arr1[],int arr2[],int n,int m){
        int array2[]=new int [Math.max(n, m)];
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    array2[i]=arr1[i];   
                }

            }
           
        }
        for(int i = 0;i<array2.length;i++){
            System.err.print(array2[i]);
        }
    }
}
