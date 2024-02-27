import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        // Display a simple message dialog
        JOptionPane.showMessageDialog(null, "Hello, this is a message dialog.");

        // Display a message dialog with custom title and icon
        JOptionPane.showMessageDialog(
                null,
                "This is a message with a custom title and information icon.",
                "Custom Dialog",
                JOptionPane.INFORMATION_MESSAGE);

        // Display a confirmation dialog and get user input
        int result = JOptionPane.showConfirmDialog(
                null,
                "Do you want to continue?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION);

        // Process user's choice
        if (result == JOptionPane.YES_OPTION) {
            System.out.println("User clicked Yes");
        } else {
            System.out.println("User clicked No or closed the dialog");
        }

        // Display an input dialog and get user input as a string
        String userInput = JOptionPane.showInputDialog(
                null,
                "Enter your name:",
                "Input Dialog",
                JOptionPane.QUESTION_MESSAGE);

        // Process user input
        if (userInput != null) {
            System.out.println("Hello, " + userInput + "!");
        } else {
            System.out.println("User canceled the input dialog.");
        }
    }
}
