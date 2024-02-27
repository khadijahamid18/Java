import java.util.Scanner;

// FACTORIAL
public class sumLoop {
    public static void main(String[] args) {

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
            // sum = sum + i;

        }

        System.out.println(sum);

        sc.close();
    }
}
