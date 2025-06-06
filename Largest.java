public class Largest {
    
    public static void main(String[] args) {// main method to execute the program
       
        Largest largestFinder = new Largest();// create an instance of Largest class
        largestFinder.findLargest();// call the method to find the largest number
    }
    int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// initialize an array of integers

    int largest = arr[0];// assume the first element is the largest
    public void findLargest() {// method to find the largest number in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {// compare each element with the current largest 
                largest = arr[i];// update largest if a larger number is found
            }
        }
        System.out.println("The largest number is: " + largest);// print the largest number
    }
}
