public class Sort {
    
    public static void main(String[] args) {
        int array []={2,0,2,1,1,0};
        sort(array);//calling the function
        for (int i : array) {
            System.out.print(i + " ");
        }
        
    }

    public static void sort(int array[]){
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
