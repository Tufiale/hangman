public class HangmanCommands {

    private int maxIncorrectGuesses = 10;
    UserInput userInput = new UserInput();
    char guessedLetter = userInput.getGuessFromUser();

    public void commands() {
        intro();


        while (true) {

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

}
