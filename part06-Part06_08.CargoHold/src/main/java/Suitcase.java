import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public String toString() {
        int cnt = items.size();
        int weight = 0;
        for (int i = 0; i < items.size(); i++) {
            weight += items.get(i).getWeight();
        }
        if (cnt == 0)
            return "no items (" + weight + " kg)";
        if (cnt == 1)
            return cnt + " item (" + weight + " kg)";
        return cnt + " items (" + weight + " kg)";
    }

    public void printItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getWeight();
        }
        return sum;
    }

    public Item heaviestItem() {
        Item heaviest = null;
        for (int i = 0; i < items.size(); i++) {
            if (heaviest == null || heaviest.getWeight() < items.get(i).getWeight()) {
                heaviest = items.get(i);
            }
        }
        return heaviest;
    }
}
