import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        Person shortest = null;
        for (int i = 0; i < persons.size(); i++) {
            if (shortest == null || persons.get(i).getHeight() < shortest.getHeight()) {
                shortest = persons.get(i);
            }
        }
        return shortest;
    }

    public Person take() {
        Person shortest = null;
        int idx = -1;
        for (int i = 0; i < persons.size(); i++) {
            if (shortest == null || persons.get(i).getHeight() < shortest.getHeight()) {
                shortest = persons.get(i);
                idx = i;
            }
        }
        if (idx != -1)
            persons.remove(idx);
        return shortest;
    }
}
