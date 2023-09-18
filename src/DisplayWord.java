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


}
