/*(Game: hangman) Write a hangman game that randomly generates a word and 
prompts the user to guess one letter at a time, as presented in the sample run. 
Each letter in the word is displayed as an asterisk. When the user makes a correct 
guess, the actual letter is then displayed. When the user finishes a word, display 
the number of misses and ask the user whether to continue to play with another 
word. Declare an array to store words, as follows:
 Add any words you wish in this array
String[] words = {"write", "that",...}
*/
import java.util.Scanner;

public class Exercise07_35 {
    public static void main(String[] args) {
        String[] words = {"Programming", "Languages", "Initialize", "The United States of America", "Emre Kurubas"};

        do {
            String word = randomWord(words);
            String coveredWord = coverWord(word);
            System.out.println(coveredWord);

            while (coveredWord.contains("*")) {
                coveredWord = checkLetter(word, guess(coveredWord), coveredWord);
            }

            System.out.println("Congratulations! You guessed the word: " + word);

        } while (playAgain() == 'y');
        System.out.print("The game has ended, thank you for playing :) See you next time.");
    }

    // Method to randomly select a word from the array
    public static String randomWord(String[] words) {
        int length = words.length;
        String randomWord = "";
        int randomNumber = (int) (Math.random() * length);

        if (randomNumber < length && randomNumber >= 0) {
            randomWord = words[randomNumber];
        }
        return randomWord;
    }

    // Method to create a covered version of the word with asterisks
    public static String coverWord(String randomWord) {
        char[] cover = new char[randomWord.length()];

        for (int i = 0; i < randomWord.length(); i++) {
            if (randomWord.charAt(i) == ' ') {
                cover[i] = ' ';
            } else {
                cover[i] = '*';
            }
        }
        return String.valueOf(cover);
    }

    // Method to check if the guessed letter is in the word
    public static String checkLetter(String word, char guess, String coveredWord) {
        char[] cover = coveredWord.toCharArray();
        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                cover[i] = word.charAt(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(guess + " is not in the word");
        } else if (coveredWord.indexOf(guess) != -1) {
            System.out.println(guess + " is already in the word");
            return coveredWord;  // Return early to avoid further processing
        }

        String updatedCoveredWord = String.valueOf(cover);
        System.out.println(updatedCoveredWord);
        return updatedCoveredWord;
    }

    // Method to get a valid letter guess from the user
    public static char guess(String coveredWord) {
        Scanner scanner = new Scanner(System.in);
        String guessLetter;

        do {
            System.out.println("(Guess) Enter a letter in word");
            guessLetter = scanner.next();
        } while (guessLetter.length() != 1 || !Character.isLetter(guessLetter.charAt(0)));

        return guessLetter.charAt(0);
    }

    // Method to check if the player wants to play again
    public static char playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to guess another word? Enter y or n: ");
        String playAgain = scanner.nextLine();

        return playAgain.charAt(0);
    }
}
