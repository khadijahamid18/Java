import java.util.Scanner;

public class tableLoop {
    public static void main(String[] args) {
        System.out.print("Enter any number for table: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) { 
            System.out.println(num + " * " + i  + " = " + num * i);
        }

        sc.close();
    }
}
