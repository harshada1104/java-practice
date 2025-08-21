public class Present {
   public static void main(String[] args) {
    int array[]={1,2,3,4,5};
    int num = 7;
    present(array, num);
   } 
   public static void present(int array[],int num){
    for(int i = 0;i<array.length;i++){
        if(array[i]==num){
            System.out.println(i);
        }else{
            System.out.println("no exits");
        }
    }
   }
}
