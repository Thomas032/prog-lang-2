import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> students;
    
    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public int getNumberOfStudents() {
        return students.size();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(name).append("\n");
        sb.append("Number of students: ").append(students.size()).append("\n");
        sb.append("Students:\n");
        for (Student student : students) {
            sb.append("- ").append(student.getName()).append("\n");
        }
        return sb.toString();
    }
}