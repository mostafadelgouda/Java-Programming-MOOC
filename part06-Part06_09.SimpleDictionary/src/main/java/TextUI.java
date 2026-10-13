import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        System.out.println("Command: ");
        String s = scanner.nextLine();
        if (s.equals("end")) {
            System.out.println("Bye bye!");
            return;
        } else if (s.equals("add")) {
            System.out.println("Word: ");
            String word = scanner.nextLine();
            System.out.println("Translation: ");
            String translation = scanner.nextLine();
            dict.add(word, translation);
        } else if (s.equals("search")) {
            System.out.println();
            s = scanner.nextLine();
            String word = dict.translate(s);
            if (word == null) {
                System.out.println("Word " + s + " was not found");
            } else
                System.out.println("Translation: " + word);

        } else {
            System.out.println("Unknown command");

        }
        start();
    }
}
