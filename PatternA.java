public class PatternA {
    public static void main(String[] args) {
        // pattern2(4);
        // pattern1(5);
        // pattern3(5);
        // pattern4(10);
        // pattern6(4);
        pattern5(8);
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("*"); // print star without moving to the next line
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    // static void pattern5(int n) {
    // for (int row = 1; row <= n; row++) {
    // for (int col = 1 ; col<= n ; col++)
    // }
    // }

    static void pattern6(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row <= n ? row : 2 * n - row;// Calculate the number of columns in the current row
            // Print stars for the current row

            // alternative way to calculate totalColsInRow

            // int totalColsInRow;
            // if (row <= n) {
            // totalColsInRow = row;
            // } else {
            // totalColsInRow = 2 * n - row;
            // }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*");
            }

            // Print newline after each row
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col= 1; col <= n; col++) {
                if (col <= n - row ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
