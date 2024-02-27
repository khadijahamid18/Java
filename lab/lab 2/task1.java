public class task1 {
    public static void main(String[] args) {
        // Creating an array of 5 Student objects
        Student[] students = new Student[5];

        // Adding data to the array
        students[0] = new Student("John", 1, "john@example.com", "123 Street, City");
        students[1] = new Student("Alice", 2, "alice@example.com", "456 Road, Town");
        students[2] = new Student("Bob", 3, "bob@example.com", "789 Avenue, Village");

        // Creating a copy of student at index 2
        students[3] = new Student(students[2]);

        // Adding data using setter methods
        students[4] = new Student();
        students[4].setRollNo(5);
        students[4].setName("Emma");
        students[4].setEmail("emma@example.com");
        students[4].setAddress("101 Lane, County");

        // Displaying data
        for (Student student : students) {
            if (student != null) {
                System.out.println("Student Information:");
                student.showData();
                System.out.println();
            }
        }
    }
}

class Student {
    String name;
    int rollNo;
    String email;
    String address;

    // default constructor
    Student() {

    }

    // parameterized constructor
    Student(String name, int rollNo, String email, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.address = address;
    }

    // copy constructor
    Student(Student otherStudent) {
        this.name = otherStudent.name;
        this.rollNo = otherStudent.rollNo;
        this.email = otherStudent.email;
        this.address = otherStudent.address;
    }

    // Getters
    String getName() {
        return name;
    }

    int getRollNo() {
        return rollNo;
    }

    String getEmail() {
        return email;
    }

    String getAddress() {
        return address;
    }

    // Setters
    void setName(String name) {
        this.name = name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setAddress(String address) {
        this.address = address;
    }

    // Input Data
    void inputData(String name, int rollNo, String email, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.address = address;
    }

    // Display data
    void showData() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }

}