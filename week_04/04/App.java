import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double number: ");
        double number = scanner.nextDouble();

        int closeUp = (int) Math.ceil(number);
        int closeDown = (int) number;

        System.out.println("Closest up: " + closeUp);
        System.out.println("Closest down: " + closeDown);

    }
}