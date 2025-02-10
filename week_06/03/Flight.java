public class Flight {
    private String airlineCompany;
    private String origin;
    private String destination;
    private String flightNumber;

    public Flight(String airlineCompany, String origin, String destination, String flightNumber) {
        this.airlineCompany = airlineCompany;
        this.origin = origin;
        this.destination = destination;
        this.flightNumber = flightNumber;
    }

    public String getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        this.airlineCompany = airlineCompany;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "FLight [airlineCompany=" + airlineCompany + ", destination=" + destination + ", flightNumber="
                + flightNumber + ", origin=" + origin + "]";
    }
}