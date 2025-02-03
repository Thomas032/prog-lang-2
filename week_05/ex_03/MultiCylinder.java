
public class MultiCylinder {
    public static void main(String[] args) {
        // Create several Cylinder objects
        Cylinder[] cylinders = {
                new Cylinder(3.3, 5),
                new Cylinder(2, 4.6),
                new Cylinder(4.2, 6)
        };

        // Calculate and print surface area and volume for each cylinder
        for (int i = 0; i < cylinders.length; i++) {
            double surfaceArea = cylinders[i].getSurfaceArea();
            double volume = cylinders[i].getVolume();
            System.out.println(cylinders[i]);
            System.out.printf("Cylinder Surface Area = %.2f, Volume = %.2f%n", surfaceArea, volume);
        }
    }

}
