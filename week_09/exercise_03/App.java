import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> frequencies = new HashMap<>();

        while (true) {
            System.out.println("Please input a number between -25 and 25: ");
            int number = scanner.nextInt();
            if (number < -25 || number > 25) {
                break;
            }
            frequencies.put(number, frequencies.getOrDefault(number, 0) + 1);
        }

        frequencies.forEach(
                (number, count) -> System.out.println("Number " + number + " was entered " + count + " times."));
    }
}
