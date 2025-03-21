public class App {
    public static void main(String[] args) {        
        // First person
        Person person1 = new Person("001", "John", "Smith");
        PersonalData personal1 = new PersonalData(35, "Male", "Married", "Master's Degree", 2);
        person1.setPers onalData(personal1);
        
        ProfessionalData professional1 = new ProfessionalData("Software Engineer", 4000, 
                                                           "Full-time", 12, "Technology");
        person1.setProfessionalData(professional1);
        GeographicData geographic1 = new GeographicData("American", "United States", 
                                                     "Seattle", "Washington", true);
        person1.setGeographicData(geographic1);
        
        // Second person
        Person person2 = new Person("002", "Roope", "Kangas");
        PersonalData personal2 = new PersonalData(28, "Female", "Single", "Master's Degree", 1);
        person2.setPersonalData(personal2);
        
        ProfessionalData professional2 = new ProfessionalData("Research Scientist", 2000, 
                                                           "Full-time", 5, "Healthcare");
        person2.setProfessionalData(professional2);
            
        GeographicData geographic2 = new GeographicData("Mexican", "United States", 
                                                     "Los Angeles", "California", true);
        person2.setGeographicData(geographic2);
        
        // Display demographic profiles
        System.out.println(person1.generateDemographicProfile());        
        System.out.println(person2.generateDemographicProfile());
        
        // PersonalData methods
        System.out.println("Age group of " + person1.getFirstName() + ": " + 
                          person1.getPersonalData().getAgeGroup());
        System.out.println("Age group of " + person2.getFirstName() + ": " + 
                          person2.getPersonalData().getAgeGroup());
        
        // ProfessionalData methods
        System.out.println("\nIncome bracket of " + person1.getFirstName() + ": " + 
                          person1.getProfessionalData().getIncomeBracket());
        System.out.println("Income bracket of " + person2.getFirstName() + ": " + 
                          person2.getProfessionalData().getIncomeBracket());
        
        System.out.println("\nEstimated monthly income of " + person1.getFirstName() + ": $" + 
                          String.format("%.2f", person1.getProfessionalData().getEstimatedMonthlyIncome()));
        System.out.println("Estimated monthly income of " + person2.getFirstName() + ": $" + 
                          String.format("%.2f", person2.getProfessionalData().getEstimatedMonthlyIncome()));
        
        // GeographicData methods
        System.out.println("\n" + person1.getFirstName() + " living in home country: " + 
                          person1.getGeographicData().isLivingInHomeCountry());
        System.out.println(person2.getFirstName() + " living in home country: " + 
                          person2.getGeographicData().isLivingInHomeCountry());
        
        System.out.println("\nAddress of " + person1.getFirstName() + ": " + 
                          person1.getGeographicData().getFormattedAddress());
        System.out.println("Address of " + person2.getFirstName() + ": " + 
                          person2.getGeographicData().getFormattedAddress());
    }
}