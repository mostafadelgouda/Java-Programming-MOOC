
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        }
        String ret = "";
        if (this.elements.size() == 1)
            ret = "The collection " + this.name + " has " + this.elements.size() + " element:";
        else
            ret = "The collection " + this.name + " has " + this.elements.size() + " elements:";
        for (int i = 0; i < this.elements.size(); i++) {
            ret += "\n" + this.elements.get(i);
        }
        return ret;
    }
}
