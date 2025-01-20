import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int slot_0 = (int) (Math.random() * 9) + 1;
            int slot_1 = (int) (Math.random() * 9) + 1;
            int slot_2 = (int) (Math.random() * 9) + 1;

            // clear the console
            System.out.print("\033[H\033[2J");

            System.out.println("Slot Machine");
            System.out.println("-------------");
            System.out.println(slot_0 + " " + slot_1 + " " + slot_2);
            System.out.println("-------------");

            if (slot_0 == slot_1 && slot_1 == slot_2) {
                System.out.println("Tripe jackpot win!");
            } else if (slot_0 == slot_1 || slot_1 == slot_2 || slot_0 == slot_2) {
                System.out.println("Double jackpot win!");
            }

            System.out.println("Do you want to run the programme again? (Y/N)");
            String response = scanner.next();
            if (response.equalsIgnoreCase("N")) {
                break;
            }
        }

    }
}