public class Consecutive {

    public static void main(String[] args) {
        int array[] = {1,0,1,1,0,1 };
        consecutive(array);

    }

    public static void consecutive(int array[]) {
        int count = 0;
           int maxCount = 0;   // longest streak found
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1) {
                count++;
               
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
