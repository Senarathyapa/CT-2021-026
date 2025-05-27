package Q07;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String sentence = scanner.nextLine();
        System.out.println("Enter the word to be replaced: ");
        String wordReplace = scanner.next();
        System.out.println("Enter the replacement word: ");
        String replacementWord = scanner.next();
        String modifiedSentence = replaceWord(sentence, wordReplace, replacementWord);
        System.out.println("Modified sentence: " + modifiedSentence);

    }

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(wordToReplace)) {
                words[i] = replacementWord;
            }
        }
        return String.join(" ", words);
    }
}


