package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sums3 {
    public static void main(String[] args) {
        int array[] = { -1, 2, -1, 5, 3 };
        threeSum(array);
    }

    public static  List<List<Integer>> threeSum(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                       if(array[i]+array[j]+array[k]==0){
                         List<Integer> triplet = Arrays.asList(array[i], array[j], array[k]);
                         Collections.sort(triplet);//to handle the dupiates
                         if(!result.contains(triplet)){
                            result.add(triplet);
                         }
                       }
                       
                }
                
            }
            
        }
        return result;
    }
}
