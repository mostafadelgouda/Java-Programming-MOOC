
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;
        int passingSum = 0;
        int participants = 0;
        int passing = 0;

        // Index represents the grade (0 to 5)
        int[] grades = new int[6];

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            // Ignore invalid points
            if (num < 0 || num > 100) {
                continue;
            }

            participants++;
            sum += num;

            // Determine grade
            int grade;

            if (num < 50) {
                grade = 0;
            } else if (num < 60) {
                grade = 1;
            } else if (num < 70) {
                grade = 2;
            } else if (num < 80) {
                grade = 3;
            } else if (num < 90) {
                grade = 4;
            } else {
                grade = 5;
            }

            grades[grade]++;

            // Passing statistics
            if (num >= 50) {
                passing++;
                passingSum += num;
            }
        }

        // Point average (all)
        double average = (double) sum / participants;
        System.out.println("Point average (all): " + average);

        // Point average (passing)
        if (passing > 0) {
            double passingAverage = (double) passingSum / passing;
            System.out.println("Point average (passing): " + passingAverage);
        } else {
            System.out.println("Point average (passing): -");
        }

        // Pass percentage
        double percentage = 100.0 * passing / participants;
        System.out.println("Pass percentage: " + percentage);

        // Grade distribution
        System.out.println("Grade distribution:");

        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");

            for (int i = 0; i < grades[grade]; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
