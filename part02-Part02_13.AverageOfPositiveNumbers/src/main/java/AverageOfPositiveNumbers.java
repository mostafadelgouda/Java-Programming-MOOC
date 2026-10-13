
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0)
                break;
            if (number > 0) {
                sum += number;
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Cannot calculate the average");
            return;
        } else
            System.out.println(sum * 1.0 / cnt);
    }
}
