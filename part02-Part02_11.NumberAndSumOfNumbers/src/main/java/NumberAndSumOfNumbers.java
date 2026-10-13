
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0)
                break;
            sum += number;
            cnt++;
        }
        System.out.println("Number of numbers: " + cnt);
        System.out.println("Sum of the numbers: " + sum);
    }
}
