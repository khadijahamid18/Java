// HALF PYRAMID

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop
        for (int row = 1; row <= n; row++) {
            // Inner loop
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");                
            }
            System.out.println();
        }
    }

}
