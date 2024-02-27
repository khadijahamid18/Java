import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator {
    private double num1;
    private double num2;

    // Default constructor
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // Parameterized constructor
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

public class CalculatorApp extends JFrame implements ActionListener {
    private JTextField numField1, numField2, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public CalculatorApp() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create GUI components
        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        resultField = new JTextField(15);
        resultField.setEditable(false);

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        // Add action listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        // Create layout using GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Add components to the frame
        c.gridx = 0;
        c.gridy = 0;
        add(new JLabel("Number 1:"), c);

        c.gridx = 1;
        c.gridy = 0;
        add(numField1, c);

        c.gridx = 0;
        c.gridy = 1;
        add(new JLabel("Number 2:"), c);

        c.gridx = 1;
        c.gridy = 1;
        add(numField2, c);

        c.gridx = 0;
        c.gridy = 2;
        add(new JLabel("Result:"), c);

        c.gridx = 1;
        c.gridy = 2;
        add(resultField, c);

        c.gridx = 0;
        c.gridy = 3;
        add(addButton, c);

        c.gridx = 1;
        c.gridy = 3;
        add(subtractButton, c);

        c.gridx = 0;
        c.gridy = 4;
        add(multiplyButton, c);

        c.gridx = 1;
        c.gridy = 4;
        add(divideButton, c);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());

        Calculator calculator = new Calculator(num1, num2);

        switch (e.getActionCommand()) {
            case "Add":
                resultField.setText(String.valueOf(calculator.add()));
                break;
            case "Subtract":
                resultField.setText(String.valueOf(calculator.subtract()));
                break;
            case "Multiply":
                resultField.setText(String.valueOf(calculator.multiply()));
                break;
            case "Divide":
                resultField.setText(String.valueOf(calculator.divide()));
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorApp calculatorApp = new CalculatorApp();
            calculatorApp.setVisible(true);
        });
    }
}
