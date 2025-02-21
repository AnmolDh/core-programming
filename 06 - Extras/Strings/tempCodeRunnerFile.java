
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        String oldWord = scanner.nextLine();

        String newWord = scanner.nextLine();

        String modifiedSentence = sentence.replace(oldWord, newWord);

        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
