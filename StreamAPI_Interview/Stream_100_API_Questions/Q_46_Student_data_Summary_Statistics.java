package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Q_46_Student_data_Summary_Statistics {
 public record Student(String name,int score,int age,String department,String gender,double fees ){}
    public static void main(String args[]){
            List<Student> students=Arrays.asList(
        new Student("Ankit", 85, 19,"CS","Male", 50000),
        new Student("Neha",92,20,"IT","Female",55000),
        new Student("Aman",45,21,"CS","Male",48000),
        new Student("Priya",88,18,"IT","Female",60000),
        new Student("Rahul",35,19,"Mechanical","Male",45000),
        new Student("Subham", 78, 22, "CS", "Male", 52000),
        new Student("Megha", 95, 20, "Electronics", "Female", 58000),
        new Student("Vicky", 40, 21, "Mechanical", "Male", 44000),
        new Student("Arati", 82, 19, "Electronics", "Female", 59000),
       new Student("Deepak", 60, 23, "IT", "Male", 53000)
     );

     //calculate the count, min, max, sum, and average of all student
     IntSummaryStatistics stats=students.stream()
     .mapToInt(Student::score)
     .summaryStatistics();

        System.out.println("Highest Score: " + stats.getMax());
        System.out.println("Lowest Score: " + stats.getMin());
        System.out.println("Average Score: " + stats.getAverage());

    


    }
    
}
