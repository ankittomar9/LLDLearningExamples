package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_88_Total_salary_of_product_development_department {
    public record Employee(int id,String name,int age,String gender,
     String department,int yearOfJoining,double salary){}
    public static void main(String args[]){    

          List<Employee> employeeList = Arrays.asList(
    new Employee(111, "Ankit Singh", 27, "Male", "Product Development", 2011, 50000.0),
    new Employee(112, "Pam Beesly", 24, "Female", "HR", 2011, 25000.0),
    new Employee(122, "Jim Halpert", 25, "Male", "Sales", 2015, 23500.0),
    new Employee(133, "Creed Bratton", 29, "Male", "Infrastructure", 2012, 18000.0), 
    new Employee(144, "Dwight Schrute", 28, "Male", "Product Development", 2014, 32500.0),
    new Employee(155, "Angela Martin", 27, "Female", "HR", 2013, 22700.0),
    new Employee(188, "Michael Scott", 31, "Male", "Product Development", 2015, 34500.0),
    new Employee(199, "Phyllis Vance", 24, "Female", "Sales", 2016, 11500.0)
);
       //  88. What is the total salary cost for the "Product Development" department?
         double totalProductDevSalary=employeeList.stream()
         .filter(e->"Product Development".equals(e.department()))
         .mapToDouble(Employee::salary)
         .sum();

         System.out.println("total salary cost for the \n Product Development\n ");
         System.out.println(totalProductDevSalary);
    
    }
    
}
