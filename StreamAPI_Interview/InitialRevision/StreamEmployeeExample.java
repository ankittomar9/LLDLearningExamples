package StreamAPI_Interview.InitialRevision;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeExample {
    public static void main(String args[]){
        Employee e1=new Employee();
        e1.setName("Ankur");      e1.setAge(27);        e1.setSalary(88000);
        e1.setDepartment("IT");
        Employee e2 = new Employee("Ankit", 27, "IT", 44000);
        //System.out.println(e2);

        List<Employee> employees= Arrays.asList(
                new Employee("Ankit", 27, "System", 44000),
                new Employee("Aman", 25, "IT", 80880),
                new Employee("Ankur", 29, "IT", 54000),
                new Employee("Neha", 36, "HR", 60000),
                 new Employee("Megha", 24, "HR", 30000),
                 new Employee("Subha", 24, "Admin", 40000)
        );

        //1. Example find employee with max age
        List<Employee> empList=employees.stream()
        .filter(e->e.getAge()>27)
        .collect(Collectors.toList());

        
        System.out.println("Employees Older than 27:" +empList);
        //empList.forEach(e -> System.out.println(e.getName() + " - " + e.getAge()));







    }


    public static class Employee{
        private String name;
        private int age;
        private double salary;
        private String Department;

        public Employee(String name, int age, String Department, double salary) {
             this.name = name;
            this.age = age;
            this.salary = salary;
             this.Department = Department;
        }
        public Employee(){

        }
        @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + ", Department='" + Department + "'}";
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return Department;
        }

        public void setDepartment(String Department) {
            this.Department = Department;
        }
        
        
    }
    
}
