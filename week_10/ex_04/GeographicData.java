public class GeographicData {
    private String nationality;
    private String countryOfResidence;
    private String city;
    private String region;
    private boolean isUrbanArea;
    
    public GeographicData(String nationality, String countryOfResidence, 
                        String city, String region, boolean isUrbanArea) {
        this.nationality = nationality;
        this.countryOfResidence = countryOfResidence;
        this.city = city;
        this.region = region;
        this.isUrbanArea = isUrbanArea;
    }
    
    public GeographicData() {
        this("", "", "", "", false);
    }
    
    public String getNationality() {
        return nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public String getCountryOfResidence() {
        return countryOfResidence;
    }
    
    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public boolean isUrbanArea() {
        return isUrbanArea;
    }
    
    public void setUrbanArea(boolean isUrbanArea) {
        this.isUrbanArea = isUrbanArea;
    }
    
    @Override
    public String toString() {
        return "Nationality: " + nationality + 
               "\nCountry of Residence: " + countryOfResidence +
               "\nCity: " + city +
               "\nRegion: " + region +
               "\nResidence Type: " + (isUrbanArea ? "Urban" : "Rural");
    }
    
    public boolean isLivingInHomeCountry() {
        return nationality.equalsIgnoreCase(countryOfResidence);
    }
    
    public String getFormattedAddress() {
        return city + ", " + region + ", " + countryOfResidence;
    }
}