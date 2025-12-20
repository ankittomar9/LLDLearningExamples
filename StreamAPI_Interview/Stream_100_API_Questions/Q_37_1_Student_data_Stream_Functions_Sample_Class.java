package StreamAPI_Interview.Stream_100_API_Questions;

public class Q_37_1_Student_data_Stream_Functions_Sample_Class{
    public static void main(String args[]){
      // but we will use record class and not traditional getter setters
      // In Spring Boot You can use Lombok  
    }
    public static class Student{
        String name;
        int score;
        int age;
        String department;
        String gender;
        double fees;
        
        public Student(String name,int score,int age,String department,String gender,double fees){
            this.name=name;
            this.score=score;
            this.age=age;
            this.department=department;
            this.gender=gender;
            this.fees=fees;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public double getFees() {
            return fees;
        }

        public void setFees(double fees) {
            this.fees = fees;
        }
     
    }
    
}
