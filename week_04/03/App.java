import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            phoneNumber.append(random.nextInt(8));
        }
        phoneNumber.append('-');

        phoneNumber.append(random.nextInt(556) + 100);
        phoneNumber.append('-');

        for (int i = 0; i < 4; i++) {
            phoneNumber.append(random.nextInt(10));
        }

        System.out.println("Random phone number: " + phoneNumber.toString());
    }
}