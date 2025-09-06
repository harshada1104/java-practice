package Practice;

public class SortArrayByParity {
    public static void main(String[] args) {
        int array []={2,6,1,3,9,10};
        sorted(array);
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    public static void sorted(int array[]){
        int left =0;
    
        for(int right =0;right<array.length;right++){
              
              if(array[right]%2==0){
                int temp = array[left];
                array[left]=array[right];
                array[right]=temp;
                left++;
              }
        }
    }
}
