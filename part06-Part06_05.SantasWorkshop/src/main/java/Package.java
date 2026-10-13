import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int sum = 0;
        for (int i = 0; i < gifts.size(); i++)
            sum += gifts.get(i).getWeight();
        return sum;
    }
}
