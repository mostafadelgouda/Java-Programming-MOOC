
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
    }

    public static int smallest(int[] array) {
        int mn = (int) 1e9;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < mn)
                mn = array[i];
        }
        return mn;
    }

    public static int indexOfSmallest(int[] array) {
        int mn = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[mn])
                mn = i;
        }
        return mn;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int mn = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[mn])
                mn = i;
        }
        return mn;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int mn = indexOfSmallestFrom(array, i);
            swap(array, i, mn);
        }
    }
}
