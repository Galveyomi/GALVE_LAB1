public class HalfDiamondNumberPattern {
    public static void main(String[] args) {
        // Number of rows for the upper part of the diamond
        int rows = 5;

        // Loop to print the upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print numbers in increasing order from 1 to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after printing numbers for a row
            System.out.println();
        }

        // Loop to print the lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print numbers in increasing order from 1 to the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after printing numbers for a row
            System.out.println();
        }
    }
}
