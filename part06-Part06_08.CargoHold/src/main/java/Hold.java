import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> cases;
    private int maxWeight;

    public Hold(int maxWeight) {
        cases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int sum = 0;

        for (int i = 0; i < cases.size(); i++) {
            sum += cases.get(i).totalWeight();
        }
        if (sum + suitcase.totalWeight() <= maxWeight) {
            cases.add(suitcase);
        }
    }

    public String toString() {
        int sum = 0;
        for (int i = 0; i < cases.size(); i++) {
            sum += cases.get(i).totalWeight();
        }
        return cases.size() + " suitcases (" + sum + " kg)";

    }

    public void printItems() {
        for (int i = 0; i < cases.size(); i++) {

            cases.get(i).printItems();
        }
    }
}
