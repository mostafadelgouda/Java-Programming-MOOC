
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal))
            this.meals.add(meal);
    }

    public void clearMenu() {
        this.meals.clear();
    }

    public void printMeals() {
        for (int i = 0; i < this.meals.size(); i++) {
            System.out.println(this.meals.get(i));
        }
    }
    // implement the required methods here
}
