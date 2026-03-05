package OOPSInterviewProblems;
public class inheritanceProblem {
    // Parent class (Super class)
static class Animal {
    String name;   
    void eat() {
        System.out.println(name + " is eating");    }
    void sleep() {
        System.out.println(name + " is sleeping");    }
}
// Child class (Subclass) - inherits from Animal
 static class  Dog extends Animal {
    // Dog gets all properties and methods from Animal
    // Plus it can have its own methods
    void bark() {
        System.out.println(name + " says: Woof! Woof!");    }}

static class Cat extends Animal {
    void meow() {
        System.out.println(name + " says: Meow!");    }}

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();    // Method from Animal class
        myDog.sleep();  // Method from Animal class
        myDog.bark();   // Dog's own method
    
        Cat myCat = new Cat();
        myCat.name = "Whiskers";
        myCat.eat();    // Method from Animal class
        myCat.meow();   // Cat's own method
    }
}
    

