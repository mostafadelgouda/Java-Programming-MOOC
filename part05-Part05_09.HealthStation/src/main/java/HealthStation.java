
public class HealthStation {
    private int cnt;

    public HealthStation() {
        cnt = 0;
    }

    public int weigh(Person person) {
        cnt++;
        return person.getWeight();
        // return -1;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return cnt;
    }
}
