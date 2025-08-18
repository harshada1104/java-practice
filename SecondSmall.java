public class SecondSmall {

    public static void main(String[] args) {
        int[] array = {3, 40, 55, 0, 99, 65, 8};
        findSecondSmallAndLarge(array);
    }

    public static void findSecondSmallAndLarge(int[] array) {
        int secondLarge = array[0];
        int large = secondLarge;
        int secondSmall = array[0];
        int small = secondSmall;

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            System.out.println(current);

            // Check for small values
            if (current < secondSmall) {
                if (secondSmall < small) {
                    small = secondSmall;
                }
                secondSmall = current;
            } 
            // Check for large values
            else if (current > secondLarge) {
                if (secondLarge > large) {
                    large = secondLarge;
                }
                secondLarge = current;
            }
        }

        System.err.println(" Largest: " + secondLarge);
        System.out.println("Second Largest: " + large);
        System.err.println(" Smallest: " + secondSmall);
        System.out.println("Second Smallest: " + small);
    }
}
