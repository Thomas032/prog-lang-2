import java.util.Random;

public class Die {
    private int value;
    private static final int MAX_VALUE = 6;
    private Random random;

    public Die() {
        value = 1;
        random = new Random();
    }

    public void roll() {
        value = random.nextInt(MAX_VALUE) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 1 && value <= MAX_VALUE) {
            this.value = value;
        } else {
            System.out.println("Invalid die value. Must be between 1 and 6.");
        }
    }

    @Override
    public String toString() {
        return "Die value: " + value;
    }
}
