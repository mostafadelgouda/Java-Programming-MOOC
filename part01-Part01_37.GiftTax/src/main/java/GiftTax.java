
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Value of gift Tax at the lower limit Tax rate(%) for exceeding part
        // 5 000 — 25 000 100 8
        // 25 000 — 55 000 1 700 10
        // 55 000 — 200 000 4 700 12
        // 200 000 — 1 000 000 22 100 15
        // 1 000 000 — 142 100 17
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double tax = 0;

        if (value < 5000) {
            System.out.println("No tax!");
            return;
        } else if (value < 25000) {
            tax = 100 + (value - 5000) * 0.08;
        } else if (value < 55000) {
            tax = 1700 + (value - 25000) * 0.10;
        } else if (value < 200000) {
            tax = 4700 + (value - 55000) * 0.12;
        } else if (value < 1000000) {
            tax = 22100 + (value - 200000) * 0.15;
        } else {
            tax = 142100 + (value - 1000000) * 0.17;
        }

        System.out.println("Tax: " + tax);
    }
}
