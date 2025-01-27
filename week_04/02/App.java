import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        int cubedSum = (int) Math.pow(number1 + number2, 3);

        System.out.println("Cubed sum of " + number1 + " and " + number2 + " is " + cubedSum);
    }

}