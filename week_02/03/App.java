import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter text: ");
            String input = scanner.nextLine();
            if (isPalindrome(input)) {
                System.out.println("The text is a palindrome.");
            } else {
                System.out.println("The text is not a palindrome.");
            }
            System.out.print("Do you want to check another text? (yes/no) ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
        scanner.close();
    }

    private static boolean isPalindrome(String text) {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}