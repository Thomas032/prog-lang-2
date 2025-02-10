import java.util.ArrayList;
import java.util.List;

public class FlightTest {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();

        Flight flight1 = new Flight("FL001", "Prague", "London", "10:00 AM");
        Flight flight2 = new Flight("FL002", "Helsinki", "Tokyo", "1:00 PM");
        Flight flight3 = new Flight("FL003", "New York", "Los Angeles", "8:00 AM");

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        flight2.setDestination("Osaka");
        flight2.setDepartureTime("2:00 PM");

        for (Flight flight : flights) {
            System.out.println(flight.getInfo());
        }
    }
}
