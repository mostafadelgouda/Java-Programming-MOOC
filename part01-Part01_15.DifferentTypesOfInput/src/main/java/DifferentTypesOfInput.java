
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        // Give a string:
        // bye-bye
        // Give an integer:
        // 11
        // Give a double:
        // 4.2
        // Give a boolean:
        // true
        // You gave the string bye-bye
        // You gave the integer 11
        // You gave the double 4.2
        // You gave the boolean true
        System.out.println("Give a string:");
        String stringInput = scan.nextLine();
        System.out.println("Give an integer:");
        int integerInput = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleInput = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean booleanInput = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + stringInput);
        System.out.println("You gave the integer " + integerInput);
        System.out.println("You gave the double " + doubleInput);
        System.out.println("You gave the boolean " + booleanInput);

    }
}
