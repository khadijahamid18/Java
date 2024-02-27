import javax.swing.*;

class Calculator {
    private double num1;
    private double num2;

    // Default Constructor
    public Calculator() {

    }

    // Parameterized constructor to ensure positive numbers
    public Calculator(double num1, double num2) {
        this.num1 = Math.max(0, num1); // Ensure non-negative numbers
        this.num2 = Math.max(0, num2); // Ensure non-negative numbers
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
            return Double.NaN;
        }
    }
}

public class CalculatorHW {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Enter 1st number (positive no.): ");
        String input2 = JOptionPane.showInputDialog("Enter 2nd number (positive no.): ");
        String operator = JOptionPane.showInputDialog("Enter the Operator: ");
        double result;

        // converting operator from string to single character
        char op = operator.charAt(0);

        // Changing the data types from string to double
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

        // Creating a Calculator object with positive numbers condition
        Calculator calculator = new Calculator(num1, num2);

        switch (op) {
            case '+':
                result = calculator.add();
                JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = calculator.subtract();
                JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = calculator.multiply();
                JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = calculator.divide();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Operator");
                return;
        }

        if (!Double.isNaN(result)) {
            JOptionPane.showMessageDialog(null, num1 + " " + op + " " + num2 + " = " + result);
        }
    }
}

// import javax.swing.JOptionPane;

// public class CalculatorHW {
// public static void main(String[] args) {

// String input1 = JOptionPane.showInputDialog("Enter 1st number(positive no.):
// ");
// String input2 = JOptionPane.showInputDialog("Enter 2nd number(positive no.):
// ");
// String opertor = JOptionPane.showInputDialog("Enter the Operator: ");
// double result;

// // converting operator from string to single character
// char op = opertor.charAt(0);

// // Changing the data types from string to double
// double num1 = Double.parseDouble(input1);
// double num2 = Double.parseDouble(input2);

// switch (op) {
// case '+':
// result = num1 + num2;
// JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + result);
// break;
// case '-':
// result = num1 - num2;
// JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + result);
// break;
// case '*':
// result = num1 * num2;
// JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + result);
// break;
// case '/':
// result = num1 / num2;
// JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + result);
// break;

// default:
// break;
// }

// }

// }
