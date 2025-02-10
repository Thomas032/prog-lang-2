public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Skoda", "Superb", 2021);
        Car car2 = new Car("Porsche", "911", 1970);

        // Display car details and check if they are antiques
        System.out.println(car1);
        System.out.println("Is car1 an antique? " + car1.isAntique());

        System.out.println(car2);
        System.out.println("Is car2 an antique? " + car2.isAntique());

        // Updating car2 details
        car2.setYear(2020);
        System.out.println("Updated car2: " + car2);
        System.out.println("Is updated car2 an antique? " + car2.isAntique());
    }
}
