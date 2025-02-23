import java.util.Scanner;
public class sentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user input
        System.out.print("Please enter the senetence: ");
        String Sentence = input.nextLine().trim();

        //ceck if input is empty
        int noOfWords = 0;
        if (Sentence.isEmpty()) {
            System.out.println("Sentence is empty");
            input.close();
            return;
        }
        //split by space and count words
        String[] words = Sentence.split("\\s+");
        System.out.println("No of words: " + words.length);
        noOfWords = words.length;

        //display longest word in the sentence
        String longestWord = words[0];
        String longestWords = words[0];
        int maxLength = words[0].length();

        for (int i = 1; i < noOfWords; i++) {
            int wordLength = words[i].length();
            if (wordLength > maxLength) {
                longestWords = words[i];
                maxLength = wordLength;
            } else if (wordLength == maxLength){
                longestWords += " " +  words[i];
            }
        }
        System.out.println("Longest word(s): " + longestWords);

        //reverse the sentence
        String reverseSentence = new StringBuilder(Sentence).reverse().toString();
        System.out.println("Reverse sentence: " + reverseSentence);
    }
}
