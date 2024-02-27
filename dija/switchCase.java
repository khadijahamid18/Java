import java.util.Scanner;

public class switchCase {
    public static void main(String args[]) {
        // User input
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Yellow");
                break;
            case 2:
                System.out.println("Red");
                break;
            case 3:
                System.out.println("Blue");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        sc.close();
    }
}
