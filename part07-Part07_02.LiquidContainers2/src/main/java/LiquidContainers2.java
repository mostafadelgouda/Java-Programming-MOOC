
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container a = new Container();
        Container b = new Container();
        while (true) {

            /*
             * First: 0/100
             * Second: 0/100
             */

            System.out.println("First: " + a);

            System.out.println("Second: " + b);

            // System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("add")) {
                String[] s = input.split(" ");
                int num = Integer.valueOf(s[1]);
                a.add(num);
            } else if (input.startsWith("move")) {
                String[] s = input.split(" ");
                int num = Integer.valueOf(s[1]);
                int mn = Math.min(a.contains(), num);
                a.remove(mn);
                b.add(mn);
            } else {
                String[] s = input.split(" ");
                int num = Integer.valueOf(s[1]);
                b.remove(num);
            }
        }

    }

}
