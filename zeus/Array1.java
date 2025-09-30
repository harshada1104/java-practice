package zeus;

public class Array1 {

public static void main(String[] args) {
    int array[] ={10,5,8,5,22};
    //largest element in an array
    int max = 0;
     for(int i =0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }
     }
     System.out.println(max);
    //smallest element in an array
     int small=array[0];
     for(int i =0;i<array.length;i++){
        if(array[i]<small){
            small=array[i];
        }
     }
     System.out.println(small);

     //sum of elements
     int sum = 0;
     for(int i =0;i<array.length;i++){
        sum += array[i];
     }
     System.out.println(sum);

     //avaerage of the elemnts
     int average = 0;
     for(int i =0;i<array.length;i++){
        average= sum/array.length;
     }
     System.out.println(average);

     //even and odd
     int even =0;
     int odd=0;
     for(int i =0;i<array.length;i++){
             if(array[i]%2==0){
                even++;
             }else{
                odd++;
             }
     }
     System.out.println(even+" "+odd);
    
     //search for an element
     int x = 5;
     for(int i =0;i<array.length;i++){
        if(array[i]==x){
            System.out.println("element exist"+i);
        }
     }
     System.out.println("doess not exist");

     //first and the last occurace
     int last = 0;
     int el = 5;
     int first = 0;
     for(int i =0;i<array.length;i++){
        if(array[i]==el){
            first= i;
        }
        if(array[i]==el && i>last){
          last = i;
           
        }

          System.out.println("last occurance "+ last + "first is "+first);
     }
    

}
}
