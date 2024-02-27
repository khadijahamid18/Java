import java.util.Scanner;

interface TwoDimensionalShape {
    double getArea();
}

class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

class Square implements TwoDimensionalShape {
    private double length;

    public Square(double length) { 
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Square with side length: " + length;
    }
}

class Triangle implements TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle with base: " + base + " and height: " + height;
    }
}

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TwoDimensionalShape[] shapes = new TwoDimensionalShape[3];

        // Input for Circle
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        shapes[0] = new Circle(radius);

        // Input for Square
        System.out.print("Enter side length of the square: ");
        double sideLength = scanner.nextDouble();
        shapes[1] = new Square(sideLength);

        // Input for Triangle
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        shapes[2] = new Triangle(base, height);


	for (int i = 0; i < shapes.length; i++) {
    		TwoDimensionalShape shape = shapes[i];
    		if (shape instanceof Circle) {
        		System.out.println("Circle area: " + shape.getArea());
    		} else if (shape instanceof Square) {
        		System.out.println("Square area: " + shape.getArea());
    		} else if (shape instanceof Triangle) {
        		System.out.println("Triangle area: " + shape.getArea());
    	}
      }   
    }
}



























//for (TwoDimensionalShape shape : shapes) {
//            if (shape instanceof Circle) {
//                System.out.println("Circle area: " + shape.getArea());
//            } else if (shape instanceof Square) {
//                System.out.println("Square area: " + shape.getArea());
//            } else if (shape instanceof Triangle) {
//                System.out.println("Triangle area: " + shape.getArea());
//            }
//      }




















