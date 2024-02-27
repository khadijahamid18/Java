import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.print("Enter the radius: "); 
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        int radius = sc.nextInt();
        double area = pi * (radius * radius);

        System.out.println("Area of the circle: " + area);

        sc.close();
    }
}
