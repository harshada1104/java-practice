public class Remove {
    public static void main(String[] args) {
        int array[] = { 0,1,2,2,3,0,4,2 };
        int val = 2;
        remove(array, val);
    }

    public static void remove(int array[], int val) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == val) {

                array[i] = -1;
                count++;
            }

        }
         System.out.println(count);
        for (int j = 0; j < array.length; j++) {
            if (array[j] != -1) {
                System.out.print(array[j]);
            }
        }
       
    }
}
