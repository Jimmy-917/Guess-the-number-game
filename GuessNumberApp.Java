import java.util.Scanner;

public class GuessNumberApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Game game = new Game();

        game.displayWelcomeMessage();

        String playAgain = "y";

        while (playAgain.equalsIgnoreCase("y")) {

            game.generateNumberToBeGuessed();
            game.displayPleaseGuessMessage();

            while (true) {

                System.out.print(
                        "Enter a number between 1 and 100: ");

                int guess = input.nextInt();

                game.makeGuess(guess);

                if (game.isCorrectGuess()) {
                    game.displayCorrectGuessMessage();
                    break;
                } else {
                    game.displayGuessAgainMessage();
                }
            }

            System.out.print(
                    "Would you like to play again? (y/n): ");
            playAgain = input.next();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}
