// public class FinalizeExample {

//     @Override
//     protected void finalize() throws Throwable {
//         try {
//             // Perform cleanup operations here
//             System.out.println("Finalize method called");
//         } finally {
//             super.finalize();
//         }
//     }

//     public static void main(String[] args) {
//         FinalizeExample obj = new FinalizeExample();

//         // Setting the reference to null to make the object eligible for garbage
//         // collection
//         obj = null;

//         // Explicitly requesting garbage collection (Note: Explicit calls are not
//         // recommended in practice)
//         System.gc();
//     }
// }
