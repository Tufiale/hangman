import java.util.Scanner;

public class HangmanCommands {

    public void commands() {
        intro();

        int maxIncorrectGuesses = getNumberOfLives();

        while (true) {
            UserInput userInput = new UserInput();
            char guessedLetter = userInput.getGuessFromUser();

            DisplayWord.updateUserGuesses(guessedLetter);
            DisplayWord.displayWordState(DisplayWord.userGuessesArray, DisplayWord.wordFromArray);

            if (DisplayWord.isGameWon()) {
                System.out.println("Congratulations! You guessed the word.");
                break;
            }

            if (DisplayWord.isGameLost(maxIncorrectGuesses)) {
                System.out.println("Game over! The word was: " + DisplayWord.wordFromArray);
                break;
            }
        }
    }

    private void intro() {
        System.out.println("****** Welcome to Hangman (Safari Edition)! *****");
        System.out.println(DisplayWord.wordToUnderscore());
    }

    private int getNumberOfLives() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of lives you want:");
        while (true) {
            int lives = scan.nextInt();
            if (lives > 0) {
                return lives;
            } else {
                System.out.println("Please enter a positive number of lives:");
            }

        }
    }
}
