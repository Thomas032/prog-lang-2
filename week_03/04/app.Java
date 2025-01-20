import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userWins = 0, computerWins = 0, ties = 0;
        String[] options = {"Rock", "Paper", "Scissors"};
        boolean keepPlaying = true;

        while (keepPlaying) {
            int computerChoice = random.nextInt(3);
            System.out.print("Enter your choice (0 = Rock, 1 = Paper, 2 = Scissors): ");
            int userChoice = scanner.nextInt();

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("You chose: " + options[userChoice]);
            System.out.println("Computer chose: " + options[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((userChoice == 0 && computerChoice == 2) || 
                       (userChoice == 1 && computerChoice == 0) || 
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
                userWins++;
            } else {
                System.out.println("Computer wins!");
                computerWins++;
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.next().toUpperCase();
            if (!playAgain.equals("Y")) {
                keepPlaying = false;
            }
        }

        System.out.println("Game Over!");
        System.out.println("Your Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);
        scanner.close();
    }
}
