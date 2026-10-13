
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(",");
            if (oldestAge < Integer.valueOf(words[1])) {
                oldestAge = Integer.valueOf(words[1]);
            }
        }
        System.out.println(oldestAge);
    }
}
