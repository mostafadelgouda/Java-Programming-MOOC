
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // First name: Jean
        // Last name: Bartik
        // Identification number: 271224
        while (true) {
            System.out.println("First name:");
            String first = scanner.nextLine();
            if (first.equals(""))
                break;
            System.out.println("Last name:");
            String last = scanner.nextLine();
            System.out.println("Identification number:");
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(first, last, id));
        }
        for (PersonalInformation p : infoCollection) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }
    }
}
