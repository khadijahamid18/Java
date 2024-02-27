// import java.util.*;

class Circle {
    // declaring the instance variable
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    protected double length;

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    // method overridden here
    // @Override 
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * radius * length;
    }
}


// final public class Test   // correct
public class Test {
    public static void main(String[] args) {

        // Circle Class
        Circle myCircle = new Circle(1.20);
        System.out.println("Area of Circle is " + myCircle.getArea());

        // Cylinder Class
        Cylinder myCylinder = new Cylinder(1.20, 2.50);
        System.out.println("Area of Cylinder is " + myCylinder.getArea());

        // Upcasting
        Circle myCircle1 = new Cylinder(1.20, 2.50);
        System.out.println("Upcasting.....");
        System.out.println("Area of Cylinder is " + myCircle1.getArea());

        // Downcasting (corrected)
        if (myCircle1 instanceof Cylinder) {
            Cylinder myCylinder2 = (Cylinder) myCircle1;
            System.out.println("Downcasting.....");
            System.out.println("Area of Cylinder is " + myCylinder2.getArea());
        } else {
            System.out.println("Downcasting failed because the object is not a Cylinder.");
        }
    }
}


// If you make the Test class final, it means that the class cannot be subclassed. In Java, marking a class as final prevents other classes from inheriting from it.

// Here's what will happen if you make the Test class final:

// Prevents Inheritance: Making the Test class final will prevent any other class from extending it. This means that no subclass can be created for the Test class. Any attempt to extend Test will result in a compilation error.

// Cannot Override Methods: Since no subclasses can be created, there won't be any subclasses to override methods from the Test class. This ensures that the behavior of the Test class cannot be altered or extended through subclassing.

// No Polymorphic Behavior: With no possibility of subclassing, polymorphic behavior involving the Test class will be restricted. Polymorphism relies on inheritance and overriding of methods, which are not possible with a final class.

// Code Safety and Stability: Marking a class as final can also provide some level of safety and stability to the codebase by preventing unintended modifications to its behavior through subclassing.

// In summary, making the Test class final would restrict its usage to its current implementation without allowing any further extension or modification through subclassing.




// import java.util.*;

// class Circle {

// // declaring the instance variable
// protected double radius;

// public Circle(double radius) {
// this.radius = radius;
// }

// public double getArea() {
// return Math.PI * radius * radius;
// }

// }

// class Cylinder extends Circle {

// protected double length;

// public Cylinder(double radius, double length) {
// super(radius);
// this.length = length;
// }

// // method overriden here
// public double getArea() {
// return 2 * super.getArea() + 2 * Math.PI * radius * length;
// }

// }

// public class Test {
// public static void main(String[] args) {

// // Circle Class
// Circle myCircle = new Circle(1.20);
// System.out.println("Area of Circle is " + myCircle.getArea());

// // Cylinder Class
// Cylinder myCylinder = new Cylinder(1.20, 2.50);
// System.out.println("Area of Cylinder is " + myCylinder.getArea());

// // UpCasting
// Circle myCircle1 = new Cylinder(1.20, 2.50);
// System.out.println("Upcasting.....");
// System.out.println("Area of Cylinder is " + myCircle1.getArea());

// // DownCasting
// Circle myCircle2 = new Cylinder(1.20, 2.50);
// Cylinder myCylinder2;
// myCylinder2 = (Cylinder) myCircle2;

// }

// }
