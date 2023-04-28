package exercises;
import java.util.*;
public class Strings {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank,\n" +
                "and of having nothing to do: once or twice she had peeped into the book her\n" +
                "sister was reading, but it had no pictures or conversations in it, 'and what\n" +
                "is the use of a book,' thought Alice 'without pictures or conversation?'\n";

        System.out.println(text);
        System.out.println("Search word: ");
        String word = sc.nextLine();

        boolean wordFound = false;
        int i = 0;

        String updatedText = text;
        ArrayList<Integer> indexes= new ArrayList<Integer>();

        do {
            for (char a : updatedText.toCharArray()) {

                if (a == word.charAt(i)) {

                    wordFound = true;
                    i++;

                    if (i == (word.length())) break;

                } else {

                    wordFound = false;
                    i = 0;

                }

            }

            indexes.add(updatedText.indexOf(word));
            updatedText = updatedText.replaceFirst(word, "");
            i = 0;

        } while (updatedText.contains(word));

        System.out.println("Word found: " + wordFound);

        if (wordFound) {
            System.out.println("Word was found at indexes of: ");
            for (Integer index : indexes) {
                System.out.print(index + " to " + Integer.sum(index, word.length()) + ", ");
            }
        }

    }
}
