
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1)
                break;
            total.addNumber(num);
            if (num % 2 == 0)
                even.addNumber(num);
            else {
                odd.addNumber(num);
            }
        }
        System.out.println("Sum: " + total.sum());

        System.out.println("Sum of even numbers: " + even.sum());

        System.out.println("Sum of odd numbers: " + odd.sum());

    }
}
