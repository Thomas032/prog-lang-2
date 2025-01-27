import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fin = "";

        fin += name.charAt(0);

        for (int i = 0; i < 5; i++) {
            fin += lastName.charAt(i);
        }

        fin += Integer.toString(random.nextInt(90) + 10);

        System.out.println("Your username is: " + fin);

    }
}