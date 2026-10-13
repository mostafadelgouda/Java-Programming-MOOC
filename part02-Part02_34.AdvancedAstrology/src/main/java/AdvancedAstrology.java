
public class AdvancedAstrology {

    public static void printStars(int number) {
        String stars = "";
        for (int i = 0; i < number; i++) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        String spaces = "";
        for (int i = 0; i < number; i++) {
            spaces += " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        int sp = size - 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(sp);
            printStars(i);
            sp--;
        }
    }

    public static void christmasTree(int height) {
        int sp = height - 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(sp);
            printStars(i * 2 - 1);
            sp--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
