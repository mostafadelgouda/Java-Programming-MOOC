
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = { 5, 1, 3, 4, 2 };
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        String ans = "";
        for (int i = 0; i < array.length; i++) {
            ans += array[i];
            if (i < array.length - 1) {
                ans += ", ";
            }
        }
        System.out.println(ans);
    }
}
