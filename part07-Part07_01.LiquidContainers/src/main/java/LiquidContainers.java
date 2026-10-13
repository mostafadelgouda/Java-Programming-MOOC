
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 0, b = 0;
        while (true) {

            /*
             * First: 0/100
             * Second: 0/100
             */

            System.out.println("First: " + a + "/100");

            System.out.println("Second: " + b + "/100");

            // System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("add")) {
                String[] s = input.split(" ");
                int num = Integer.valueOf(s[1]);
                if (num > 0) {
                    a += num;
                    if (a > 100)
                        a = 100;
                }
            } else if (input.startsWith("move")) {
                String[] s = input.split(" ");
                int num = Integer.valueOf(s[1]);
                if (num > 0) {
                    if (num > a)
                        num = a;
                    b += num;
                    a -= num;
                    if (b > 100)
                        b = 100;
                }
            } else {
                String[] s = input.split(" ");
                int num = Integer.valueOf(s[1]);
                if (num > 0) {
                    b -= num;
                    if (b < 0)
                        b = 0;
                }
            }

        }
    }

}
