
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {
    static ArrayList<Bird> arr;

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        arr = new ArrayList<>();
        while (true) {
            System.out.println("?");
            String ch = scan.nextLine();
            if (ch.equals("Add")) {
                String name = scan.nextLine();
                String nameInLatin = scan.nextLine();
                Bird tmp = new Bird(name, nameInLatin);
                arr.add(tmp);
            } else if (ch.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                int flag = 0;
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i).getName().equals(name)) {
                        arr.get(i).addObservation();
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    System.out.println("Not a bird!");
                }
            } else if (ch.equals("All")) {
                for (int i = 0; i < arr.size(); i++) {
                    System.out.println(arr.get(i));
                }
            } else if (ch.equals("One")) {
                String name = scan.nextLine();
                int flag = 0;
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i).getName().equals(name)) {
                        System.out.println(arr.get(i));
                    }
                }
            } else {
                break;
            }

        }

    }

}
