
public class Division {

    public static void main(String[] args) {

        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
    }

    public static void division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        double result = (double) a / b;
        System.out.println(result);
    }

    // implement the method here
}
