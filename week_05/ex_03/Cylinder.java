public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.setRadius(radius);
        this.setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", radius=" + radius + "]";
    }
}
