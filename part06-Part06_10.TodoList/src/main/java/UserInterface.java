import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            String word;
            if (command.equals("add")) {
                System.out.println("To add: ");
                word = scanner.nextLine();
                list.add(word);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int num = scanner.nextInt();
                list.remove(num);
            } else {
                break;
            }

        }

    }

    public void printAll() {

    }
}
