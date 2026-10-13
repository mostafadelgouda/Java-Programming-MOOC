
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0, cnt = 0, sum = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] words = input.split(",");

            if (name.length() < words[0].length()) {
                name = words[0];
            }
            cnt++;
            sum += Integer.valueOf(words[1]);
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double) sum / cnt);

    }
}
