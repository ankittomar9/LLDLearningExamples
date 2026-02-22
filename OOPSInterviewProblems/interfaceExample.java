package OOPSInterviewProblems;
public class interfaceExample {
    // Define an interface
interface Animal {
    void makeSound();  // Just the method signature, no body
    void eat();
}
// Class implementing the interface
public static class Dog implements Animal {
    // Must provide implementation for all interface methods
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    public void eat() {
        System.out.println("Dog is eating");
    }
}
public static class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
    public void eat() {
        System.out.println("Cat is eating");
    }
}
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Woof! Woof!
        myDog.eat();        // Output: Dog is eating
        
        Animal myCat = new Cat();
        myCat.makeSound();  // Output: Meow!
        myCat.eat();        // Output: Cat is eating
    }
}

