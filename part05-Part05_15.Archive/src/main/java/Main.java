
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> arr = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String s = scanner.nextLine();
            if (s.isEmpty())
                break;
            System.out.println("Name? (empty will stop)");
            String bs = scanner.nextLine();
            if (bs.isEmpty())
                break;
            User u = new User(bs, s);
            if (!arr.contains(u)) {
                arr.add(u);
            }
        }
        // System.out.println("==Items==");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
