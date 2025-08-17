public class PlusOne {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        plusOne(array);
    }

    public static void plusOne(int[] array) {
        int number = 0;
        int finall = 0;
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            int doub = (int) Math.pow(10, length);
            number = array[i] * doub;

            length--;
            finall = doub + number;
        }
        System.out.println(number);
        System.out.println(finall);
    }
}
