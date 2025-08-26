public class ThirdMax {
    public static void main(String[] args) {
        int array[]={3,2};
        thirdMax(array);
        int size =array.length-3;
        int size2=array.length-2;
        if(array.length>3){
 System.out.println(array[size]);
        }else{
            System.out.println(array[size2]); 
        }
       

    }

    public static void thirdMax(int[] array) {
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    
    }
}
