package StreamAPI_Interview.Stream_100_API_Questions;

public class Q_37_1_Student_data_Stream_Functions_Sample_Class {
    public static void main(String args[]) {
        // In interviews, use 'record' (Java 16+) or Lombok (@Data) for brevity.
          // but we will use record class and not traditional getter setters
      // In Spring Boot You can use Lombok  
    }
    }
    public static class Student {
        private String name;     private int score;
        private int age;           private String department;     
        private String gender;     private double fees;

        public Student(String name, int score, int age, String dept, String gender, double fees) {
            this.name = name; this.score = score; this.age = age;
            this.department = dept; this.gender = gender; this.fees = fees;
        }
        // Getters & Setters condensed to fit one page
        public String getName() { return name; } public void setName(String name) { this.name = name; }
        public int getScore() { return score; } public void setScore(int score) { this.score = score; }
        public int getAge() { return age; } public void setAge(int age) { this.age = age; }
        public String getDepartment() { return department; } public void setDepartment(String d) { this.department = d; }
        public String getGender() { return gender; } public void setGender(String g) { this.gender = g; }
        public double getFees() { return fees; } public void setFees(double fees) { this.fees = fees; }
      
        @Override
        public String toString() { return "Student{name='" + name + "', score=" + score + "}"; }
    }
