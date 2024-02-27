// interface Shape {
//     double CalculateArea();

//     double CalculatePerimeter();
// }

// class Square implements Shape {
//     private double length;

//     // default constructor
//     public Square() {
//         this.length = 0;
//     }

//     // parameterized constructor
//     public Square(double length) {
//         this.length = length;
//     }

//     // copy constructor
//     public Square(Square square) {
//         this.length = square.length;
//     }

//     public void setLength(double length) {
//         this.length = length;
//     }

//     public double getLength() {
//         return length;
//     }

//     // @Override
//     public double CalculateArea() {
//         return length * length;
//     }

//     // @Override
//     public double CalculatePerimeter() {
//         return 4 * length;
//     }

//     // @Override
//     public String toString() {
//         return "Square - Area: " + CalculateArea() + ", Perimeter: " + CalculatePerimeter();
//     }
// }

// class Rectangle implements Shape {
//     private double length;
//     private double width;

//     public Rectangle() {
//         this.length = 0;
//         this.width = 0;
//     }

//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     public Rectangle(Rectangle rectangle) {
//         this.length = rectangle.length;
//         this.width = rectangle.width;
//     }

//     public void setLength(double length) {
//         this.length = length;
//     }

//     public void setWidth(double width) {
//         this.width = width;
//     }

//     public double getLength() {
//         return length;
//     }

//     public double getWidth() {
//         return width;
//     }

//     // @Override
//     public double CalculateArea() {
//         return length * width;
//     }

//     // @Override
//     public double CalculatePerimeter() {
//         return 2 * (length + width);
//     }

//     // @Override
//     public String toString() {
//         return "Rectangle - Area: " + CalculateArea() + ", Perimeter: " + CalculatePerimeter();
//     }
// }

// class Circle implements Shape {
//     private final double PI = 3.14;
//     private double radius;

//     public Circle() {
//         this.radius = 0;
//     }

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public Circle(Circle circle) {
//         this.radius = circle.radius;
//     }

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     // @Override
//     public double CalculateArea() {
//         return PI * radius * radius;
//     }

//     // @Override
//     public double CalculatePerimeter() {
//         return 2 * PI * radius;
//     }

//     // @Override
//     public String toString() {
//         return "Circle - Area: " + CalculateArea() + ", Perimeter: " + CalculatePerimeter();
//     }
// }

// public class task1 {
//     public static void main(String[] args) {
//         Shape[] shapes = new Shape[5];

//         shapes[0] = new Square(5);
//         shapes[1] = new Rectangle(4, 6);
//         shapes[2] = new Circle(3);
//         shapes[3] = new Square(7);
//         shapes[4] = new Circle(5);

//         for (Shape shape : shapes) {
//             System.out.println(shape.toString());
//         }
//     }
// }

// // for (Shape shape : shapes) sets up a loop that iterates over each element in
// // the shapes array, assigning each element to the variable shape one at a time.
// // This allows you to perform operations on each element of the array inside the
// // loop.