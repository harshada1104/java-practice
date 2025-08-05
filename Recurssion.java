public class Recurssion {
    
    static int cnt = 0;

    //printing something for desire times
    static void print(){

        //base condition
        if(cnt == 3)return;
        System.out.println(cnt);

        //count increment
        cnt = cnt + 1;
        print();

    }

    //print name n times
    static void printname( int i , int n){

        //base condition
        if (i>=n)return;
        System.out.println("harshada");


        //incremment
        
        printname(i+1, n);
    }

       //print name 1-n 
    static void print1( int i , int n){

        //base condition
        if (i>=n)return;
        System.out.println(i);


        //incremment
        
        print1(i+1, n);
    }

    //print no from n-1
 static void printN1( int i , int n){

        //base condition
        if (i<1)return;
        System.out.println(i);


        printN1(i-1, n);
 }
 //print sum of first n numbers
  static void printSum( int i , int n, int sum){

        //base condition
        if (i>=n)return;
         sum =  sum + i;
         System.out.println(sum);

        printSum(i+1, n,sum );
        
 }

  //function to print an array
  static void printArray(int ans[],int n){
    System.out.println("reversed array is ");
    for(int i = 0;i<n;i++){
        System.out.println(ans[i]+" ");
    }
  }
    static void printArray11(int ans[],int n){
    System.out.println("reversed array is ");
    for(int i = 0;i<n;i++){
        System.out.println(ans[i]+" ");
    }
  }
  static void printArray16(int ans[],int n){
    System.out.println("reversed array is ");
    for(int i = 0;i<n;i++){
        System.out.println(ans[i]+" ");
    }
  }
    static void printArray17(int ans[],int n){
    System.out.println("reversed array is ");
    for(int i = 0;i<n;i++){
        System.out.println(ans[i]+" ");
    }
  }
   static void printArray18(int ans[],int n){
    System.out.println("reversed array is ");
    for(int i = 0;i<n;i++){
        System.out.println(ans[i]+" ");
    }
  }
    static void printArray19(int ans[],int n){
    System.out.println("reversed array is ");
    for(int i = 0;i<n;i++){
        System.out.println(ans[i]+" ");
    }
  }

   //print the reverse array
  static void reverseArray(int arr[],int start,int end){
 if(start<end){
    int tmp = arr[start];
    arr[start]=arr[end];
    arr[end]=tmp;
    reverseArray(arr, start+1, end-1);
 }
  }
     //print the reverse array
  static void reverseArray1(int arr[],int start,int end){
 if(start<end){
    int tmp = arr[start];
    arr[start]=arr[end];
    arr[end]=tmp;
    reverseArray(arr, start+1, end-1);
 }
  }
     //print the reverse array
  static void reverseArray2(int arr[],int start,int end){
 if(start<end){
    int tmp = arr[start];
    arr[start]=arr[end];
    arr[end]=tmp;
    reverseArray(arr, start+1, end-1);
 }
  }

    static void reverseArray3(int arr[],int start,int end){
 if(start<end){
    int tmp = arr[start];
    arr[start]=arr[end];
    arr[end]=tmp;
    reverseArray(arr, start+1, end-1);
 }
  }
   static void reverseArray4 (int arr[],int start,int end){
 if(start<end){
    int tmp = arr[start];
    arr[start]=arr[end];
    arr[end]=tmp;
    reverseArray(arr, start+1, end-1);
 }
  }
      
    public static void main(String[] args) {
    //   print();
    //   printname(0, 4);
    //   print1(0, 4);
    //   int n = 4;
    //   printN1(n, n);
    //   printSum(0, 4, 0);
      int n = 5;
      int arr[]={5,6,78,2,8};
      reverseArray(arr, 0, n-1);
      printArray(arr, n);
    }


    
}

