import java.util.ArrayList;

public class Stack {
    ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public void add(String value) {
        this.values.add(value);
    }

    public ArrayList<String> values() {
        return this.values;
    }

    public String take() {
        int idx = this.values.size() - 1;
        String val = this.values.get(idx);
        this.values.remove(idx);
        return val;
    }
}
