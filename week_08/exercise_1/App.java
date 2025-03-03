public class App {
    public static void main(String[] args) {
        // Create a course
        Course zoology = new Course("Zoology");
        
        // Create students with addresses and test points
        Student student1 = new Student("John Smith");
        student1.setHomeAddress(new Address("123 Main St", "Cityville", "12345"));
        student1.setSchoolAddress(new Address("456 Campus Rd", "University City", "67890"));
        student1.setTestPoint(0, 85);
        student1.setTestPoint(1, 92);
        student1.setTestPoint(2, 78);
        
        Student student2 = new Student("Jane Doe");
        student2.setHomeAddress(new Address("789 Oak Ave", "Townsville", "34567"));
        student2.setSchoolAddress(new Address("456 Campus Rd", "University City", "67890"));
        student2.setTestPoint(0, 95);
        student2.setTestPoint(1, 88);
        student2.setTestPoint(2, 91);
        
        Student student3 = new Student("Alex Johnson");
        student3.setHomeAddress(new Address("321 Pine Rd", "Villagetown", "98765"));
        student3.setSchoolAddress(new Address("456 Campus Rd", "University City", "67890"));
        student3.setTestPoint(0, 72);
        student3.setTestPoint(1, 68);
        student3.setTestPoint(2, 79);
        
        // Add students to the course
        zoology.addStudent(student1);
        zoology.addStudent(student2);
        zoology.addStudent(student3);
        
        // Print course information
        System.out.println(zoology);
        
        // Print detailed student information
        System.out.println("\nDetailed Student Information:");
        for (Student student : zoology.getStudents()) {
            System.out.println(student);
            System.out.println("-----------------");
        }
    }
}