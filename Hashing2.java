public class Hashing2 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8};//decalred the array
        int result = searching(2, arr); // input the values by calling the function in the main method
        System.out.println("Count: " + result);
    }

    //basic brutforce method to check how many times the no appears in the arrray
    static int searching(int no, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {//starting with the for loop (interating through the entire array)
            if (arr[i] == no) {//condition to check wheather the given no is same as the no in array
                count = count + 1;//increamenting if true
            }
        }
        return count;//here returning the value it can only be returned if the fuction has int into it
    }
}

 