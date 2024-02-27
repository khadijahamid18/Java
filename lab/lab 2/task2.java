import javax.swing.JOptionPane;

// Shape class
class Shape {
    protected double area;
    protected double volume;

    // Default constructor
    public Shape() {
    }

    // Parameterized constructor
    public Shape(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    // Copy constructor
    public Shape(Shape other) {
        this.area = other.area;
        this.volume = other.volume;
    }

    // Get input method
    public void getInput() {
        String input = JOptionPane.showInputDialog("Enter area:");
        this.area = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter volume:");
        this.volume = Double.parseDouble(input);
    }

    // toString method
    // @Override
    public String toString() {
        return "Area: " + area + ", Volume: " + volume;
    }
}

// Square class
class Square extends Shape {
    private double width;
    private double length;
    private double height;

    // Default constructor
    public Square() {
    }

    // Parameterized constructor
    public Square(double area, double volume, double width, double length, double height) {
        super(area, volume);
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // Copy constructor
    public Square(Square other) {
        super(other);
        this.width = other.width;
        this.length = other.length;
        this.height = other.height;
    }

    // Overriding getInput method
    // @Override
    public void getInput() {
        String input = JOptionPane.showInputDialog("Enter width:");
        this.width = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter length:");
        this.length = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Enter height:");
        this.height = Double.parseDouble(input);

        area = width * length;
        volume = width * length * height;
    }

    // Overriding toString method
    // @Override
    public String toString() {
        return "Width: " + width + ", Length: " + length + ", Height: " + height + ", " + super.toString();
    }
}

// Sphere class
class Sphere extends Shape {
    private double radius;
    private final double PI = 3.14;

    // Default constructor
    public Sphere() {
    }

    // Parameterized constructor
    public Sphere(double area, double volume, double radius) {
        super(area, volume);
        this.radius = radius;
    }

    // Copy constructor
    public Sphere(Sphere other) {
        super(other);
        this.radius = other.radius;
    }

    // Overriding getInput method
    // @Override
    public void getInput() {
        String input = JOptionPane.showInputDialog("Enter radius:");
        this.radius = Double.parseDouble(input);

        area = 4 * PI * radius * radius;
        volume = (4 / 3.0) * PI * radius * radius * radius;
    }

    // Overriding toString method
    // @Override
    public String toString() {
        return "Radius: " + radius + ", " + super.toString();
    }
}

// Driver class
public class task2 {
    public static void main(String[] args) {
        // Creating Shape objects
        Shape shape1 = new Shape();
        Square square1 = new Square();
        Sphere sphere1 = new Sphere();

        // Getting input for each object
        shape1.getInput();
        square1.getInput();
        sphere1.getInput();

        // Displaying information for each object
        JOptionPane.showMessageDialog(null, "Shape 1: " + shape1);
        JOptionPane.showMessageDialog(null, "Square 1: " + square1);
        JOptionPane.showMessageDialog(null, "Sphere 1: " + sphere1);

    //     Shape[] shapes = new Shape[5];

    //     // Creating Square objects
    //     shapes[0] = new Square(5.0, 6.0, 7.0, 6.8, 3.5);
    //     shapes[1] = new Square(3.0, 4.0, 5.0, 4.7, 3.6);

    //     // Creating Sphere objects
    //     shapes[2] = new Sphere(3.0, 3.0, 4.0);
    //     shapes[3] = new Sphere(5.0, 4.7, 3.8);

    //     // Creating objects using default constructor and calling getInput
    //     shapes[4] = new Square();
    //     shapes[4].getInput();

    //     // Displaying information of shapes
    //     for (Shape shape : shapes) {
    //         System.out.println(shape);
    //     }
    }
}