import java.util.*;

public class factorial {

    public static void printFactorial(int num) {

        // Invalid no
        if (num < 0) {
            System.out.println("Invalid number!");
            return;
        }

        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = i * fact;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
        return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        printFactorial(num);

        sc.close();
    }
}
