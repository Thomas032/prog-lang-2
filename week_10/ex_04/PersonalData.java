public class PersonalData {
    private int age;
    private String gender;
    private String maritalStatus;
    private String education;
    private int familySize;
    
    public PersonalData(int age, String gender, String maritalStatus, 
                       String education, int familySize) {
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.education = education;
        this.familySize = familySize;
    }
    
    public PersonalData() {
        this(0, "", "", "", 0);
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getMaritalStatus() {
        return maritalStatus;
    }
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    public String getEducation() {
        return education;
    }
    
    public void setEducation(String education) {
        this.education = education;
    }
    
    public int getFamilySize() {
        return familySize;
    }
    
    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }
    
    @Override
    public String toString() {
        return "Age: " + age + 
               "\nGender: " + gender +
               "\nMarital Status: " + maritalStatus +
               "\nEducation: " + education +
               "\nFamily Size: " + familySize;
    }
    
    public String getAgeGroup() {
        if (age < 18) {
            return "Minor";
        } else if (age < 30) {
            return "Young Adult";
        } else if (age < 50) {
            return "Adult";
        } else if (age < 65) {
            return "Middle-aged";
        } else {
            return "Senior";
        }
    }
}