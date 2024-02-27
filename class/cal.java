import java.util.*;

public class cal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double userInput1 = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        double userInput2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = userInput1 + userInput2;
                System.out.println(userInput1 + " + " + userInput2 + " = " + result);
                break;
            case '-':
                result = userInput1 - userInput2;
                System.out.println(userInput1 + " - " + userInput2 + " = " + result);
                break;
            case '*':
                result = userInput1 * userInput2;
                System.out.println(userInput1 + " * " + userInput2 + " = " + result);
                break;
            case '/':
                result = userInput1 / userInput2;
                System.out.println(userInput1 + " / " + userInput2 + " = " + result);
                break;
            case '%':
                result = userInput1 / userInput2;
                System.out.println(userInput1 + " % " + userInput2 + " = " + result);
                break;

            default:
                System.out.println("Invalid number!");
                break;
        }

        input.close();

    }
}
