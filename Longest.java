public class Longest {
    
    public static void main(String[] args) {
        int array[]={100, 200, 1, 3, 2, 4};
        
    }

    public static void greater(int array[]){
        int small=0;
        
        for(int i=0;i<array.length;i++){
            for(int e=0;e<array.length;e++){
           if(array[e]<small){
            small=array[e];
           }
        }
            for(int j=0;j<array.length;j++){
                int sum=small+1;
              if(sum==array[j]){
                System.out.println(array);
              }
            }
        }
    }
}
