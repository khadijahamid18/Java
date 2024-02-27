import java.util.*;

class Health
{
	private String name;
	private double weight;
	private double height;
	private double bmi;

	Health(String name, double weight, double height)
	{
 		this.name = name;
		this.weight = weight;
		this.height = height;
		this.bmi = calculateBMI(weight, height);
	}

	double calculateBMI(double weight, double height) 
	{
        	return weight / (height * height);
    	}

	String getName() 
	{
        	return name;
    	}

        double getWeight() 
	{
        	return weight;
    	}

    	double getHeight() 
	{
        	return height;
    	}

    	double getBMI() 
	{
        	return bmi;
    	}

	
}

class IndexOccupiedException extends Exception 
{	
    
    public String toString() {
        return "Index is already occupied. Please enter another index";
    }	
    
}

class IndexException extends Exception 
{
    
    public String toString() {
        return "There is no data at this index. Please enter another index.";
    }	
}

class Driver
{

    private static Health[] people;
    // An array of people containing the health objects

	public Driver (int size) {
		people = new Health[size];
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int N = scanner.nextInt();

        try {
            if (N < 0) {
                throw new NegativeArraySizeException("Number of people cannot be negative. Please enter the positive number!");
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


    public static void save() throws IndexOccupiedException
    {
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

