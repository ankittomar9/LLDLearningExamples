package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_81_Employee_data_Count_Employees_each_department {
    public record Employee(int id,String name,int age,String gender,
        String Department,int yearOfJoining,double salary){}
    public static void main(String args[]){
        List<Employee> employeeList =Arrays.asList(
            new Employee(111,"Ankit Singh",27,"Male","Product Development",2011,50000.0)
        );

    }
    
}
