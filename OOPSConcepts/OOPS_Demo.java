// Abstraction & Inheritance (Person is an abstract base class)
abstract class Person {
    // Encapsulation (Fields are private)
    private String name;
    private String email;
    private int age;
    private long phoneNumber; // Use long for robustness
    // Constructor
    public Person(String name, String email, int age, long phoneNumber) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    // Encapsulation (Public Getters/Setters)
    public String getName() {
         return name; 
        }
    public void setName(String name) {
         this.name = name; 
        }

    public int getAge() { return age; }
    public void setAge(int age) { 
        if (age > 0) { // Example of controlled access
            this.age = age;
        } 
    }
    // Abstract method (Abstraction: forces subclasses to implement this)
    public abstract void displayProfile();

    // Utility Getter
    public String getEmail() { return email; }
    public long getPhoneNumber() { return phoneNumber; }
}

// Inheritance (Employee IS-A Person)
class Employee extends Person {
    private String employeeId;
    private double baseSalary;
    
    // Constructor calling parent (Person) constructor
    public Employee(String name, String email, int age, long phoneNumber, String employeeId, double baseSalary) {
        super(name, email, age, phoneNumber);
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    // Polymorphism: Method Overriding (Runtime Polymorphism)
    // Providing a specific implementation for the abstract method
    @Override
    public void displayProfile() {
        System.out.println("--- Employee Profile ---");
        System.out.println("ID: " + this.employeeId);
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Phone: " + this.getPhoneNumber());
        System.out.println("Base Salary: $" + this.baseSalary);
    }
    
    // Polymorphism: Method Overloading (Compile-Time Polymorphism)
    public double calculateSalary() {
        // Simple implementation
        return baseSalary;
    }
    
    public double calculateSalary(double bonusPercentage) {
        // Overloaded method with different parameters
        double bonus = baseSalary * (bonusPercentage / 100);
        return baseSalary + bonus;
    }
}

// Main class to demonstrate the concepts
public class OOPS_Demo {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating OOPS Concepts ---");
        
        // Creating an Employee object
        Employee emp = new Employee("Alice Johnson", "alice@corp.com", 30, 9876543210L, "E1001", 60000.0);

        // 1. Encapsulation in action: Accessing data via getters/setters
        System.out.println("\n1. Encapsulation:");
        System.out.println("Current Age: " + emp.getAge()); // Get access
        emp.setAge(31); // Set access (controlled)
        System.out.println("New Age: " + emp.getAge());

        // 2. Abstraction & 3. Inheritance in action:
        System.out.println("\n2. Abstraction & 3. Inheritance:");
        // The Employee object inherited all Person methods and provides a specific displayProfile.
        emp.displayProfile();

        // 4. Polymorphism in action:
        System.out.println("\n4. Polymorphism:");
        
        // Method Overloading (Compile-Time)
        System.out.println("Calculated Salary (Base): $" + emp.calculateSalary()); 
        System.out.println("Calculated Salary (+10% Bonus): $" + emp.calculateSalary(10.0));
        
        // Polymorphism: Using the base class type to hold a subclass object
        Person p = new Employee("Bob Smith", "bob@corp.com", 45, 1122334455L, "E1002", 80000.0);
        System.out.println("\nMethod Overriding (Runtime - using Person reference):");
        // Calls the OVERRIDDEN Employee's displayProfile() method, demonstrating Runtime Polymorphism
        p.displayProfile(); 
    }
}