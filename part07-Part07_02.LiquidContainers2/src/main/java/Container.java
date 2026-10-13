public class Container {
    private int sum;

    public Container() {
        sum = 0;
    }

    public int contains() {
        return sum;
    }

    public void add(int amount) {
        if (amount < 0)
            return;
        sum += amount;

        sum = Math.min(sum, 100);
    }

    public void remove(int amount) {
        if (amount < 0)
            return;
        sum -= amount;
        sum = Math.max(sum, 0);
    }

    public String toString() {
        return sum + "/100";
    }
}
