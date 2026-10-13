import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> items;

    public TodoList() {
        items = new ArrayList<>();
    }

    public void add(String task) {
        items.add(task);
    }

    public void print() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ": " + items.get(i));
        }

    }

    public void remove(int number) {
        items.remove(number - 1);
    }

}
