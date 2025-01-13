import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int input = scanner.nextInt();

        int hours = input / 3600;
        int minutes = (input % 3600) / 60;
        int remainingSeconds = input % 60;

        if (hours > 0) {
            System.out.printf("%02d:%02d:%02d\n", hours, minutes, remainingSeconds);
        } else {
            System.out.printf("%02d:%02d\n", minutes, remainingSeconds);
        }
    }
}