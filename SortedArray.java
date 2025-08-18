public class SortedArray {
    
    public static void main (String [] args){
        int array[] = {5,4,3,2,1};  // Try with {5,4,3,2,1}
        sorted(array);
    }

    public static void sorted(int []array){
        boolean isSorted = true; // flag

        for(int i=0;i<array.length-1;i++){
            int temp = array[i];
            System.out.println(temp);

            if(array[i+1] < temp || array[i+1] > temp){   // if next is smaller, not sorted
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array not sorted");
        }
    }
}
