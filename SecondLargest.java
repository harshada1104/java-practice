public class SecondLargest {
    public static void main (String[]args){
        SecondLargest secondLargestFinder = new SecondLargest(); // create an instance of SecondLargest class
        secondLargestFinder.findSecondLargest(); // call the method to find the second largest number
    }
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // initialize an array of integers
    int largest = arr[0]; // assume the first element is the largest
    int secondLargest = arr[0]; // assume the first element is the second largest
    public void findSecondLargest(){
        for (int i = 1; i < arr.length; i++) { // iterate through the array starting from the second element
            if (arr[i] > largest) { // if the current element is greater than the largest
                secondLargest = largest; // update second largest to be the previous largest
                largest = arr[i]; // update largest to the current element
            } else if (arr[i] > secondLargest && arr[i] != largest) { // if current element is not equal to largest and is greater than second largest
                secondLargest = arr[i]; // update second largest to the current element
            }
        }
        System.out.println("The second largest number is: " + secondLargest); // print the second largest number
    }

}
