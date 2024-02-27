import java.util.*;

public class conditions {
    // public static void main(String args[]) {
    //     // for input
    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();

    //     if (age > 18) {
    //         System.out.println("Adult");
    //     } else {
    //         System.out.println("Not adult");
    //     }
    // }

    public static void main(String args[]) {
        // for input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("a and b are equal");
        } else if (a > b) {
            System.out.println("a is greater then b");
        } else {
            System.out.println("a is less then b");
        }

        sc.close();
    }
}
