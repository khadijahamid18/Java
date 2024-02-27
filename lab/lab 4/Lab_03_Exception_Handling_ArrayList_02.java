import java.util.*;

class duplicateCustomerException extends Exception {
    public String toString() {
        return "Customer with same ID already exists, Please enter valid ID next time.";
    }
}

class invalidAgeException extends Exception {
    public String toString() {
        return "Customer age cannot be less than 18 and cannot be greater than 65, Please enter valid age next time.";
    }
}

class lowBalanceException extends Exception {
    public String toString() {
        return "Balance value cannot be less than 0. Please enter valid Balance next time";
    }
}

class invalidCustomerIDException extends Exception {
    public String toString() {
        return "Customer with the ID does not exists, Please enter valid ID next time.";
    }
}

class Customer {
    String name;
    String id;
    int age;
    double balance;

    public Customer(String name, String id, int age, double balance) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.balance = balance;
    }

    public void print() {
        System.out.println("Customer Information");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    ArrayList customers;

    public Bank() {
        customers = new ArrayList();
    }

    // public void addCustomer() {
    // System.out.println("\nADD");
    // Scanner inp = new Scanner(System.in);

    // try {
    // System.out.println("Enter name of the customer: ");
    // String n = inp.nextLine();

    // System.out.println("Enter ID of the customer: ");
    // String ii = inp.nextLine();
    // // System.out.println("MY ID: " + ii);

    // for (int i = 0; i < customers.size(); i++) {
    // // Customer obj = (Customer) customers.get(i);

    // // if((ii).equals(obj.id)) {
    // // throw new duplicateCustomerException();
    // // }

    // try {
    // Customer obj = (Customer) customers.get(i);

    // if ((ii).equals(obj.id)) {
    // throw new duplicateCustomerException();
    // }
    // } catch (duplicateCustomerException e) {
    // System.out.println("Exception: " + e);
    // }
    // }

    // System.out.println("Enter age of the customer: ");
    // int a = inp.nextInt();

    // if (a < 18 || a > 65)
    // throw new invalidAgeException();

    // System.out.println("Enter balance of the customer: ");
    // double b = inp.nextDouble();

    // if (b <= 0)
    // throw new lowBalanceException();

    // Customer cust = new Customer(n, ii, a, b);

    // customers.add(cust);
    // } catch (duplicateCustomerException e) {
    // System.out.println("Exception: " + e);
    // } catch (invalidAgeException e) {
    // System.out.println("Exception: " + e);
    // } catch (lowBalanceException e) {
    // System.out.println("Exception: " + e);
    // }
    // }

    public void addCustomer() {
        System.out.println("\nADD");
        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Enter name of the customer: ");
            String n = inp.nextLine();

            System.out.println("Enter ID of the customer: ");
            String ii = inp.nextLine();

            for (int i = 0; i < customers.size(); i++) {
                Customer obj = (Customer) customers.get(i);

                if ((ii).equals(obj.id)) {
                    throw new duplicateCustomerException();
                }
            }

            System.out.println("Enter age of the customer: ");
            int a = inp.nextInt();

            if (a < 18 || a > 65)
                throw new invalidAgeException();

            System.out.println("Enter balance of the customer: ");
            double b = inp.nextDouble();

            if (b <= 0)
                throw new lowBalanceException();

            Customer cust = new Customer(n, ii, a, b);

            customers.add(cust);
        } catch (duplicateCustomerException e) {
            System.out.println("Exception: " + e);
            System.out.println("Please enter a different ID for the customer.");
        } catch (invalidAgeException e) {
            System.out.println("Exception: " + e);
        } catch (lowBalanceException e) {
            System.out.println("Exception: " + e);
        }
    }

    public void searchCustomer() {
        System.out.println("\nSEARCH");
        Scanner inp = new Scanner(System.in);

        try {
            int flag = 0;

            System.out.println("Enter ID of the customer: ");
            String ii = inp.nextLine();

            for (int i = 0; i < customers.size(); i++) {
                Customer cust = (Customer) customers.get(i);

                if (ii.equals(cust.id)) {
                    flag = 1;
                    cust.print();
                }
            }

            if (flag == 0)
                throw new invalidCustomerIDException();
        } catch (invalidCustomerIDException e) {
            System.out.println("Exception: " + e);
        }
    }
}

public class Lab_03_Exception_Handling_ArrayList_02 {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.addCustomer();
        b.addCustomer();
        // b.addCustomer();

        b.searchCustomer();
    }
}

// Sure, let's break down each step of this loop:

// 1. `for (int i = 0; i < customers.size(); i++) {`: This line initializes a
// loop that iterates over each element in the `customers` ArrayList. It starts
// by setting the loop variable `i` to 0 and continues as long as `i` is less
// than the size of the ArrayList `customers`. After each iteration, `i` is
// incremented by 1.

// 2. `Customer obj = (Customer) customers.get(i);`: Inside the loop, this line
// retrieves the element at index `i` from the `customers` ArrayList using the
// `get()` method. Since `customers` contains objects of type `Customer`, the
// retrieved object is cast to type `Customer` and assigned to the variable
// `obj`.

// 3. `if ((ii).equals(obj.id)) {`: This line checks if the ID entered by the
// user (`ii`) matches the ID of the current `Customer` object (`obj`) obtained
// from the ArrayList. It uses the `equals()` method to compare the IDs. If the
// IDs are equal, it means that a customer with the same ID already exists, so
// it proceeds to the next step.

// 4. `throw new duplicateCustomerException();`: If the IDs match, this line
// throws a new instance of the `duplicateCustomerException`. This means that a
// duplicate customer has been found with the same ID, and the exception will be
// caught and handled elsewhere in the code.

// Overall, this loop iterates through each `Customer` object in the `customers`
// ArrayList, checks if any of them have the same ID as the one entered by the
// user, and throws a `duplicateCustomerException` if a match is found.






// Certainly! This line of code retrieves an element from the ArrayList named
// `customers` at the index `i`, then casts it to type `Customer` and assigns it
// to the variable `obj`.

// Here's a breakdown of each part:

// - `customers`: This is the ArrayList containing objects of type `Customer`.
// It likely holds various customer records.
// - `.get(i)`: This method retrieves the element at the specified index `i`
// from the ArrayList `customers`.
// - `(Customer)`: This is a type cast. It tells the compiler to treat the
// retrieved object as an instance of the `Customer` class. Since ArrayLists in
// Java are designed to hold objects of type `Object`, a cast is needed to
// convert the retrieved object to its original type.
// - `Customer obj = ...`: This part declares a variable named `obj` of type
// `Customer` and assigns the retrieved object to it after casting.

// In summary, this line retrieves a `Customer` object from the `customers`
// ArrayList at the specified index `i`, ensuring that it's treated as a
// `Customer` object, and then assigns it to the variable `obj` for further
// processing within the loop.