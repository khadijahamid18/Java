// Parent class (Superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Accessing methods from the parent class (Animal)
        myDog.eat();
        myDog.sleep();

        myCat.eat();
        myCat.sleep();

        // Accessing methods specific to the subclasses
        myDog.bark();
        myCat.meow();
    }
}
