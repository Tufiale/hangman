import java.util.Scanner;

public class UserInput {

Scanner scan = new Scanner(System.in);

public char getGuessFromUser(){
    System.out.println("Please enter a letter:");
    return scan.next().toUpperCase().charAt(0);
}

}
