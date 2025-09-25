package PracticeDSA;                                 

public class RemoveDulicates {                        

    public static void main(String[] args) {        
        int arr[] = {1,1,2,2,2,3,3};                 
        int k = removeDuplicates(arr);               
        System.out.println("The array after removing duplicate elements is "); 
        for (int i = 0; i < k; i++) {                
            System.out.print(arr[i] + " ");         
        }                                            
    }                                                


    static int removeDuplicates(int[] arr) {
        int i = 0;                                   // 12) 'i' is index of last unique element found (starts at 0)
        for (int j = 1; j < arr.length; j++) {       // 13) 'j' scans the array from second element to end
            if (arr[i] != arr[j]) {                  // 14) when we find a new value different from arr[i]
                i++;                                 // 15) move the unique pointer forward to next slot
                arr[i] = arr[j];                     // 16) copy the newly found unique value into arr[i]
            }                                        // 17) end if
        }                                            // 18) end for
        return i + 1;                                // 19) number of unique elements = index + 1
    }                                                // 20) end removeDuplicates
}                                                    // 21) end class
