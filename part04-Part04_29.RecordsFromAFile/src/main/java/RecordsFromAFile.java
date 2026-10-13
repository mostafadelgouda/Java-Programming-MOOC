
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String[] arr = fileScanner.nextLine().split(",");
                System.out.println(arr[0] + ", age: " + arr[1] + " years");
            }
        } catch (Exception e) {

        }

    }
}
