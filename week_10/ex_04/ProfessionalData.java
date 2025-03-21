public class ProfessionalData {
    private String occupation;
    private double annualIncome;
    private String employmentStatus;
    private int yearsOfExperience;
    private String industry;
    
    public ProfessionalData(String occupation, double annualIncome, 
                           String employmentStatus, int yearsOfExperience, 
                           String industry) {
        this.occupation = occupation;
        this.annualIncome = annualIncome;
        this.employmentStatus = employmentStatus;
        this.yearsOfExperience = yearsOfExperience;
        this.industry = industry;
    }
    
    public ProfessionalData() {
        this("", 0.0, "", 0, "");
    }
    
    public String getOccupation() {
        return occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    public double getAnnualIncome() {
        return annualIncome;
    }
    
    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
    
    public String getEmploymentStatus() {
        return employmentStatus;
    }
    
    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public String getIndustry() {
        return industry;
    }
    
    public void setIndustry(String industry) {
        this.industry = industry;
    }
    
    @Override
    public String toString() {
        return "Occupation: " + occupation + 
               "\nAnnual Income: $" + String.format("%.2f", annualIncome) +
               "\nEmployment Status: " + employmentStatus +
               "\nYears of Experience: " + yearsOfExperience +
               "\nIndustry: " + industry;
    }
    
    public String getIncomeBracket() {
        if (annualIncome < 25000) {
            return "Low Income";
        } else if (annualIncome < 75000) {
            return "Middle Income";
        } else if (annualIncome < 200000) {
            return "Upper Middle Income";
        } else {
            return "High Income";
        }
    }
    
    public double getEstimatedMonthlyIncome() {
        double taxRate = 0.25; // Simplified tax rate
        return (annualIncome * (1 - taxRate)) / 12;
    }
}