import java.util.Scanner;

public class UserInput {

    Scanner scan = new Scanner(System.in);

    public char getGuessFromUser() {
        char userChar;
        while (true) {
            System.out.println("Please enter a letter:");
            String userInput = scan.next().toUpperCase();
            if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
                userChar = userInput.charAt(0);
                break;
            } else {
                System.out.println("That's not a letter, my friend. Please try again.");
            }
        }
        return userChar;
    }
}

