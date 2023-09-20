import java.util.ArrayList;
import java.util.Random;

public class AnimalWords {

    private static ArrayList<String> words = new ArrayList<>();

    private static Random random = new Random();

    static {
        words.add("ELEPHANT");
        words.add("MONKEY");
        words.add("TIGER");
        words.add("GIRAFFE");
        words.add("SNAKE");
        words.add("LION");
        words.add("LLAMA");
        words.add("GORILLA");
        words.add("FISH");
        words.add("SPIDER");
    }

    public static String selectRandomWord() {
        return words.get(random.nextInt(words.size()));
    }

}
