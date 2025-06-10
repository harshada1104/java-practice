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
        Pattern18(4);
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

    static void Pattern12(int n) {
        // initial no. of spaces in row 1.
        int spaces = 2 * (n - 1);
        for (int row = 1; row <= n; row++) {
            System.out.print(row);
            for (int col = 1; col <= spaces; col++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
            spaces -= 2;
        }
    }

    static void Pattern13(int n) {
        int origin = 0;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.err.print(origin + 1 + " ");
                origin++;
            }
            System.out.println();
        }
    }

    static void Pattern14(int n) {
        for (int row = 0; row <= n; row++) {
            for (char col = 'A'; col <= 'A' + row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void Pattern15(int n) {
        int starter = n;
        for (int row = 0; row <= n; row++) {
            for (char col = 'A'; col <= 'A' + starter; col++) {
                System.out.print(col + " ");

            }
            System.out.println();
            starter--;
        }
    }

    static void Pattern16(int n) {

        for (int row = 0; row <= n; row++) {
            for (char col = 0; col <= row; col++) {
                System.out.print((char) ((int) ('A' + row)) + " ");
            }
            System.out.println();
        }
    }

    static void Pattern17(int n) {
        for (int i = 0; i < n; i++) {

            // for printing the spaces.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // for printing the characters.
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {

                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // for printing the spaces again.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }
    }

    static void Pattern18(int n) {
        for (int row = 0; row <= n; row++) {
            char ch = (char) ('A' + n);
            for (int col = 0; col <= row; col++) {

                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
static void Pattern19(int n) {
        for (int row = 0; row <= n; row++) {
            char ch = (char) ('A' + n);
            for (int col = 0; col <= row; col++) {

                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }

    
}
