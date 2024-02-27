// // public class task1 {
// //     public static void main(String[] args) {
// //         int n1 = 7;
// //         int n2 = 14;

// //         // Outer loop  -> rows remain fixed (7)
// //         for (int row = 1; row <= n1; row++) {
// //             // Inner loop -> changes
// //             // 1st part
// //             for (int col = 1; col <= n2; col++) {
// //                 System.out.print("*");
// //             }

// //             // 2nd part

// //             System.out.println();
// //         }
// //     }
// // }

// public class task1 {
//     public static void main(String[] args) {
//         int size = 7; // Size of the shape (odd number for symmetry)

//         // Loop to print the shape
//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 // Conditions to determine where to print * or space
//                 if (i == 0 || i == size - 1 || j == 0 || j == size - 1 || i == j || j == size - i - 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); // Move to the next line after each row is printed
//         }
//     }
// }

