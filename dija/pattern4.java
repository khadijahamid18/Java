// OTHER HALF INVERTED PYRAMID

public class pattern4 {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for (int row = n; row >= 1; row--) {
            // Inner loop -> space print
            for (int col = 1; col <= n - row; col++) {
                System.out.print("   ");
            }

            // Inner loop -> start print
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
