public class Person {
    private String id;
    private String firstName;
    private String lastName;
    
    private PersonalData personalData;
    private ProfessionalData professionalData;
    private GeographicData geographicData;
    
    public Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Person() {
        this("", "", "");
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public PersonalData getPersonalData() {
        return personalData;
    }
    
    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }
    
    public ProfessionalData getProfessionalData() {
        return professionalData;
    }
    
    public void setProfessionalData(ProfessionalData professionalData) {
        this.professionalData = professionalData;
    }
    
    public GeographicData getGeographicData() {
        return geographicData;
    }
    
    public void setGeographicData(GeographicData geographicData) {
        this.geographicData = geographicData;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + id + ")";
    }
    
    public String generateDemographicProfile() {
        StringBuilder profile = new StringBuilder();
        profile.append("DEMOGRAPHIC PROFILE FOR: ").append(toString()).append("\n\n");
        
        if (personalData != null) {
            profile.append("PERSONAL DATA:\n").append(personalData.toString()).append("\n\n");
        }
        
        if (professionalData != null) {
            profile.append("PROFESSIONAL DATA:\n").append(professionalData.toString()).append("\n\n");
        }
        
        if (geographicData != null) {
            profile.append("GEOGRAPHIC DATA:\n").append(geographicData.toString()).append("\n\n");
        }
        
        return profile.toString();
    }
}