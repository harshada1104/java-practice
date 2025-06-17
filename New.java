public class New {

    public static void main(String[] args) {
        extraction(7789);
    }

    static void extraction(int n) {
        int count = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            count = count + 1;
            n = n / 10;
        }
        System.out.println(count);
    }

}