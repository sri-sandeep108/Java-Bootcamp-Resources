
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    private static Scanner scan = new Scanner(System.in);
    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {
        char[] randomWordArray = words[(int) (Math.random() * words.length)].toCharArray();
        int lives = 0;
        String misses = "";

        char[] hiddenWordArray = new char[randomWordArray.length];
        for (int i = 0; i < randomWordArray.length; i++) {
            hiddenWordArray[i] = '_';
        }
        char guess;
        while (lives < 6) {
            System.out.println(gallows[lives]);
            System.out.print("Word : ");
            printHiddenWord(hiddenWordArray);
            System.out.println("Misses : " + misses + "\n\n");
            System.out.print("Guess : ");
            guess = scan.next().charAt(0);

            if (!(Arrays.toString(randomWordArray).indexOf(guess) == -1)) {
                for (int i = 0; i < randomWordArray.length; i++) {
                    if (guess == randomWordArray[i]) {
                        hiddenWordArray[i] = guess;
                    }
                }
                if (checkWin(hiddenWordArray)) {
                    System.out.println(gallows[lives]);
                    System.out.print("Word : ");
                    printHiddenWord(hiddenWordArray);
                    System.out.println("GOOD WORK!");
                    System.exit(0);
                }
            } else {
                misses += guess;
                lives++;
            }
        }
        System.out.print(gallows[lives] + "\n\n The Word is : ");
        printHiddenWord(randomWordArray);
        System.out.print("RIP");

    }

    public static void printHiddenWord(char[] word) {
        for (char letter : word) {
            System.out.print(letter + " ");
        }
        System.out.println("\n\n");
    }

    public static boolean checkWin(char[] word) {
        for (char letter : word) {
            if (letter == '_') {
                return false;
            }
        }
        return true;

    }

}
