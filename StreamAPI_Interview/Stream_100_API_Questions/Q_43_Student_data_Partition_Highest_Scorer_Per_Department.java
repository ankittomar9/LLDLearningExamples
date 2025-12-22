package StreamAPI_Interview.Stream_100_API_Questions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q_43_Student_data_Partition_Highest_Scorer_Per_Department{
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
     //Top Performing Student at each Department 
     Map<String,Optional<Student>> top_Scorer_Per_Department=students.stream()
                .collect(Collectors.groupingBy(
                    Student::department,
                    Collectors.maxBy(Comparator.comparingInt(Student::score))
                ));
     System.out.println("Top Scorer : \n"+top_Scorer_Per_Department);
 
    }
}
