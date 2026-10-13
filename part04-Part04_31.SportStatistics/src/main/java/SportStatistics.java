
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int cnt = 0, wins = 0, loss = 0;
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String[] s = fileScanner.nextLine().split(",");
                int a = Integer.valueOf(s[2]);
                int b = Integer.valueOf(s[3]);

                if (s[0].equals(team) || s[1].equals(team)) {
                    cnt++;
                }
                if ((s[0].equals(team) && a > b) || (s[1].equals(team) && a < b))
                    wins++;
                else if ((s[0].equals(team) || s[1].equals(team)) && a != b)
                    loss++;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Games: " + cnt);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);
    }

}
