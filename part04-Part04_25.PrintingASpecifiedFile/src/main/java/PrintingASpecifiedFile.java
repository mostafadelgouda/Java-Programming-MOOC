
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String file = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                System.out.println(scanner2.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
