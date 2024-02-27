// OTHER HALF PYRAMID

public class pattern3 {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for (int row = 1; row <= n; row++) {
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
