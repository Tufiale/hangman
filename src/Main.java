public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Hangman!");
        System.out.println(DisplayWord.wordToUnderscore());
        UserInput userInput = new UserInput();
        char guessedLetter = userInput.getGuessFromUser();
        DisplayWord.updateUserGuesses(guessedLetter);
        DisplayWord.displayWordState(DisplayWord.userGuessesArray, DisplayWord.wordFromArray);


    }
}