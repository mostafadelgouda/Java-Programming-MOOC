
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(",");
            if (oldestAge < Integer.valueOf(words[1])) {
                oldestAge = Integer.valueOf(words[1]);
                name = words[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
