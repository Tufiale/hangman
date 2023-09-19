import java.util.ArrayList;

public class DisplayWord {

    public static String wordFromArray = AnimalWords.selectRandomWord();

    public static ArrayList<Character> userGuessesArray = new ArrayList<>();

    public static String wordToUnderscore() {
        return " _ ".repeat(wordFromArray.length());
    }

    public static void updateUserGuesses(char guessedLetter) {
        userGuessesArray.add(guessedLetter);
    }

    public static void displayWordState(ArrayList<Character> userGuessesArray, String wordFromArray) {
        for (int i = 0; i < wordFromArray.length(); i++) {
            if (userGuessesArray.contains(wordFromArray.charAt(i))) {
                System.out.print(wordFromArray.charAt(i));
            } else {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }

    public static boolean isGameWon() {
        for (char letter : wordFromArray.toCharArray()) {
            if (!userGuessesArray.contains(letter)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGameLost(int maxIncorrectGuesses) {
        int incorrectGuessCount = 0;

        for (char guess : userGuessesArray) {
            if (wordFromArray.indexOf(guess) == -1) {
                incorrectGuessCount++;
            }
        }

        System.out.println("*** You have used " + incorrectGuessCount + " lives out of " + maxIncorrectGuesses + ". ***");

        return incorrectGuessCount >= maxIncorrectGuesses;
    }
}



