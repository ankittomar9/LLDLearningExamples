package StreamAPI_Interview.Stream_100_API_Questions;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_85_Emp_Data_Employees_in_sales {
    public record Employee(int id,String name,int age,String gender,
        String department,int yearOfJoining,double salary){}
    public static void main(String args[]){
        List<Employee> employeeList =Arrays.asList(
    new Employee(111,"Ankit Singh",27,"Male","Product Development",2011,50000.0),
    new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
    new Employee(122, "Paul Niksui", 25, "Male", "Sales", 2015, 13500.0),
    new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
    new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
    new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0),
    new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0),
    new Employee(199, "Amelia Zoe", 24, "Female", "Sales", 2016, 11500.0));

       //     85. How many male and female employees are there in the  team?
           Map<String,Long> salesEmployeeCount=employeeList.stream()
           .collect(Collectors.groupingBy(Employee::gender, Collectors.counting()));
       

            System.out.println("male and female employees : \n ");    
            System.out.println(salesEmployeeCount);

    }
    
}
