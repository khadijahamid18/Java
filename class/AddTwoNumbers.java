import javax.swing.JOptionPane;

public class AddTwoNumbers {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog(null, "Enter 1st number: ");
        String input2 = JOptionPane.showInputDialog(null, "Enter 2nd number: ");

        // Parse the input as double

        try {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            double sum = num1 + num2;

            JOptionPane.showMessageDialog(null, "The sum is " + sum);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Number! Plase enter a valid number");
        }
    }
}
