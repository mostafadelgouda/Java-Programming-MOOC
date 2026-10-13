public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        if (this.value == 5)
            return true;
        return false;
    }
}