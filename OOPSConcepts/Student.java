package OOPSConcepts;

public class Student {
    int age;
    String name;
    int id;

    public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id);
    }

    public static void main(String args[]){
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        student1.id = 101;
        student1.display();

        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;
        student2.id = 102;
        student2.display();
    }
    
    
}
