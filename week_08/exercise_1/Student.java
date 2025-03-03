public class Student {
    private String name;
    private Address homeAddress;
    private Address schoolAddress;
    private int[] testPoints = new int[3];
    
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setHomeAddress(Address address) {
        this.homeAddress = address;
    }
    
    public Address getHomeAddress() {
        return homeAddress;
    }
    
    public void setSchoolAddress(Address address) {
        this.schoolAddress = address;
    }
    
    public Address getSchoolAddress() {
        return schoolAddress;
    }
    
    public void setTestPoint(int index, int points) {
        if (index >= 0 && index < 3) {
            testPoints[index] = points;
        }
    }
    
    public int getTestPoint(int index) {
        if (index >= 0 && index < 3) {
            return testPoints[index];
        }
        return -1;
    }
    
    public double getAverageTestPoints() {
        double sum = 0;
        for (int point : testPoints) {
            sum += point;
        }
        return sum / testPoints.length;
    }
    
    @Override
    public String toString() {
        return "Student: " + name + 
               "\nHome address: " + (homeAddress != null ? homeAddress.toString() : "Not set") + 
               "\nSchool address: " + (schoolAddress != null ? schoolAddress.toString() : "Not set") +
               "\nTest points: " + testPoints[0] + ", " + testPoints[1] + ", " + testPoints[2] +
               "\nAverage: " + getAverageTestPoints();
    }
}