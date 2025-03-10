import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> frequencies = new HashMap<>();

        while (true) {
            System.out.println("Please input a number between 0 and 50: ");
            int number = scanner.nextInt();
            if (number < 0 || number > 50) {
                break;
            }
            frequencies.put(number, frequencies.getOrDefault(number, 0) + 1);
        }

        frequencies.forEach(
                (number, count) -> System.out.println("Number " + number + " was entered " + count + " times."));
    }
}
