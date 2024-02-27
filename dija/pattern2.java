// INVERTED HALF PYRAMID

public class pattern2 {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for (int row = n; row >= 1; row--) {
            // Inner loop
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
