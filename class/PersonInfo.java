// import javax.swing.*;
// import java.util.*;

// public class PersonInfo {
//     String name;
//     String address;
//     String phoneNum;

//     // parameterized constructor
//     public PersonInfo(String n, String a, String p) {
//         name = n;
//         address = a;
//         phoneNum = p;
//     }

//     // method for displaying person record on GUI
//     public void print() {
//         JOptionPane.showMessageDialog(null, "name: " + name + "address:" + address +
//                 "phone no:" + phoneNum);
//     }
// }// end of class

// class AddressBook {
//     ArrayList persons;

//     // constructor
//     public AddressBook() {
//         persons = new ArrayList();
//     }

//     // add new person record to arraylist after taking input
//     public void addPerson() {
//         String name = JOptionPane.showInputDialog("Enter name");
//         String add = JOptionPane.showInputDialog("Enter address");
//         String pNum = JOptionPane.showInputDialog("Enter phoneNo");
//         // construt new person object
//         PersonInfo p = new PersonInfo(name, add, pNum);
//         // add the above PersonInfo object to arraylist
//         persons.add(p);

//     }

//     // search person record by name by iterating over arraylist
//     public void searchPerson(String n) {
//         for (int i = 0; i < persons.size(); i++) {
//             PersonInfo p = (PersonInfo) persons.get(i);
//             if (n.equals(p.name)) {
//                 p.print();
//             }
//         } // end for
//     }

//     // end searchPerson
//     // delete person record by name by iterating over arraylist
//     public void deletePerson(String n) {
//         for (int i = 0; i < persons.size(); i++) {
//             PersonInfo p = (PersonInfo) persons.get(i);
//             if (n.equals(p.name)) {
//                 persons.remove(i);
//             }
//         } // end of for loop
//     }// end of delete person

// } // end class

// class Test {
//     public static void main(String args[]) {
//         AddressBook ab = new AddressBook();
//         String input, s;
//         int ch;
//         while (true) {
//             input = JOptionPane.showInputDialog(
//                     "Enter 1 to add " + "\n Enter 2 to Search \n Enter 3 to Delete" + "\n Enter 4 to Exit");
//             ch = Integer.parseInt(input);
//             switch (ch) {
//                 case 1:
//                     ab.addPerson();
//                     break;
//                 case 2:
//                     s = JOptionPane.showInputDialog("Enter name to search ");
//                     ab.searchPerson(s);
//                     break;
//                 case 3:
//                     s = JOptionPane.showInputDialog("Enter name to delete ");
//                     ab.deletePerson(s);
//                     break;
//                 case 4:
//                     System.exit(0);
//             }
//         } // end while
//     }// end main
// }


import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

class PersonInfo {
    String name;
    String address;
    String phoneNum;

    // parameterized constructor
    public PersonInfo(String n, String a, String p) {
        name = n;
        address = a;
        phoneNum = p;
    }

    // method for displaying person record on GUI
    public void print() {
        JOptionPane.showMessageDialog(null, "Name: " + name + "\nAddress: " + address +
                "\nPhone No: " + phoneNum);
    }
}

class AddressBook {
    ArrayList<PersonInfo> persons;

    // constructor
    public AddressBook() {
        persons = new ArrayList<>();
    }

    // add new person record to arraylist after taking input
    public void addPerson() {
        String name = JOptionPane.showInputDialog("Enter name");
        String add = JOptionPane.showInputDialog("Enter address");
        String pNum = JOptionPane.showInputDialog("Enter phoneNo");
        // construct new person object
        PersonInfo p = new PersonInfo(name, add, pNum);
        // add the above PersonInfo object to arraylist
        persons.add(p);
    }

    // search person record by name by iterating over arraylist
    public void searchPerson(String n) {
        for (PersonInfo p : persons) {
            if (n.equals(p.name)) {
                p.print();
                return; // exit the loop after finding the person
            }
        }
        // Print a message if the person is not found
        JOptionPane.showMessageDialog(null, "Person not found!");
    }

    // delete person record by name by iterating over arraylist
    public void deletePerson(String n) {
        Iterator<PersonInfo> iterator = persons.iterator();
        while (iterator.hasNext()) {
            PersonInfo p = iterator.next();
            if (n.equals(p.name)) {
                iterator.remove();
                return; // exit the loop after removing the person
            }
        }
        // Print a message if the person is not found
        JOptionPane.showMessageDialog(null, "Person not found!");
    }
}

class Test {
    public static void main(String args[]) {
        AddressBook ab = new AddressBook();
        String input, s;
        int ch;
        while (true) {
            input = JOptionPane.showInputDialog(
                    "Enter 1 to add\nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to Exit");
            ch = Integer.parseInt(input);
            switch (ch) {
                case 1:
                    ab.addPerson();
                    break;
                case 2:
                    s = JOptionPane.showInputDialog("Enter name to search ");
                    ab.searchPerson(s);
                    break;
                case 3:
                    s = JOptionPane.showInputDialog("Enter name to delete ");
                    ab.deletePerson(s);
                    break;
                case 4:
                    System.exit(0);
            }
        } // end while
    }// end main
}
