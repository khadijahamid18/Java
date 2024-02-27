import java.util.Scanner;

class Health {
    private String name;
    private double weight;
    private double height;
    private double bmi;

    public Health(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI(weight, height);
    }

    private double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI() {
        return bmi;
    }
}

class IndexOccupiedException extends Exception {
    public IndexOccupiedException(String message) {
        super(message);
    }
}

class IndexException extends Exception {
    public IndexException(String message) {
        super(message);
    }
}

class Driver {
    private static Health[] people;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int N = scanner.nextInt();

        try {
            if (N < 0) {
                throw new NegativeArraySizeException("Number of people cannot be negative.");
            }
            people = new Health[N];
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
            return;
        }

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add value in the array");
            System.out.println("2. Retrieve and print the information of specific user at index n");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        save();
                    } catch (IndexOccupiedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        retrieve();
                    } catch (IndexException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void save() throws IndexOccupiedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index:");
        int index = scanner.nextInt();

        if (index < 0 || index >= people.length) {
            throw new IndexOccupiedException("Invalid index.");
        }

        if (people[index] != null) {
            throw new IndexOccupiedException("Index already occupied.");
        }

        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter weight:");
        double weight = scanner.nextDouble();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();

        people[index] = new Health(name, weight, height);
    }

    private static void retrieve() throws IndexException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index:");
        int index = scanner.nextInt();

        if (index < 0 || index >= people.length) {
            throw new IndexException("Invalid index.");
        }

        if (people[index] == null) {
            throw new IndexException("No data found at this index.");
        }

        Health person = people[index];
        System.out.println("Name: " + person.getName());
        System.out.println("Weight: " + person.getWeight());
        System.out.println("Height: " + person.getHeight());
        System.out.println("BMI: " + person.getBMI());
    }
}


// This code defines two classes, Health to represent a person's health data, and Driver to provide functionality for saving and retrieving data for an array of people. It includes exception handling for various scenarios as described in your requirements.