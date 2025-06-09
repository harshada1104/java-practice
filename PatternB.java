public class PatternB {
    public static void main(String[] args) {
        // Pattern1(4);
        // Pattern2(4);
        // Pattern3(4);
        // Pattern4(4);
        // Pattern5(4);
        // Pattern6(5);
        // Pattern7(5);
        // Pattern8(5);
        // Pattern9(5);
        Pattern11(6);
    }

    // ****
    // ****
    // ****
    // ****
    // ****

    static void Pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // *
    // **
    // ***
    // ****

    static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    // 1
    // 12
    // 123
    // 1234

    static void Pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
    }

    // 1
    // 22
    // 333
    // 4444
    static void Pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
        System.out.println();
    }

    // *****
    // ****
    // ***
    // **
    // *

    static void Pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 12345
    // 1234
    // 123
    // 12
    // 11

    static void Pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col);

            }
            System.out.println();
        }
        System.out.println();
    }

    static void Pattern7(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < n - col - 1; col++) {
                System.out.println(" ");
            }
        }
    }

    static void Pattern8(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * n - (2 * row + 1); col++) {
                System.out.print("*");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    static void Pattern9(int n) {
        for (int row = 0; row <= n * 2; row++) {

            for (int col = 0; col <= n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < n - col - 1; col++) {
                System.out.println(" ");
            }

            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * n - (2 * row + 1); col++) {
                System.out.print("*");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }

        }

    }

    static void Pattern10(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {

            }
        }
    }

    static void Pattern11(int n) {
        int start = 1;
        for (int row = 0; row <= n; row++) {
            if (row % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int col = 0; col <= row; col++) {
                System.out.print(start);
                start = 1 - start; // Toggle between 0 and 1
            }
            System.out.println();
        }
    }
}
