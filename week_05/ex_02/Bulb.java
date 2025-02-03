public class Bulb {
    private boolean isOn;
    private int id;

    public Bulb(int id) {
        this.id = id;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    @Override
    public String toString() {
        return "Bulb is " + (isOn ? "ON" : "OFF");
    }

}
