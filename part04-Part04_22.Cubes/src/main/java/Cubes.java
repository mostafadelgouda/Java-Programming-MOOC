
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("end"))
                break;
            int x = Integer.parseInt(s);
            System.out.println(x * x * x);
        }
    }
}
