
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 1;
        for (int i = 2; i <= number; i++) {
            sum *= i;
        }
        System.out.println("Factorial: " + sum);
    }
}
