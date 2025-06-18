class Solution {

    public static void main(String[] args) {
        reverse(1234);
        plandrom(121);
        Armstrong(153);
        Divisors(56);
        Prime(7);
    }

    static void reverse(int x) {
        int reverse = 0;
        int last = 0;
        for (int i = 0; i <= x + 2; i++) {
            last = x % 10;
            reverse = (reverse * 10) + last;
            x = x / 10;

        }
        System.out.println(reverse + "hey");
    }

    static void plandrom(int x) {
        int original = x;
        int reverse = 0;
        int last = 0;
        while (x != 0) {
            last = x % 10;
            reverse = (reverse * 10) + last;
            x = x / 10;

        }
        if (reverse == original) {
            System.out.println("its plandrome" + original);

        } else {
            System.out.println("its not a plandrome" + original);
        }
    }

    static void Armstrong(int x) {
        int sum = 0;
        int last = 0;
        int original = x;
        while (x != 0) {
            last = x % 10;
            sum = sum + (last * last * last);
            x = x / 10;
            System.out.println(sum);
        }
        if (sum == original) {
            System.out.println("its an armstrong no" + sum);
        } else {
            System.out.println("its not" + sum);
        }
    }

    static void Divisors(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }

        }
    }

    static void Prime(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                count++;
                System.out.println(count);
            }

        }
        if (count > 2) {
            System.out.println(count);
            System.out.println("its not prime");
        } else {
            System.out.println("its a prime");
        }

    }
}