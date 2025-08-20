public class MoveZero {
    
    public static void main(String[] args) {
        int array[]={0,1,0,3,12};
        zero(array);
    }

    public static void zero(int [] array){
       for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == 0 && array[j + 1] != 0) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
       for(int i = 0;i<array.length;i++){
        System.out.print(array[i]);
       }
    }
}
