public class User {
    private String name, id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // @Override

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof User)) {
            return false;
        }

        User other = (User) compared;

        return this.id.equals(other.id);
    }

    public String toString() {
        return this.id + ": " + this.name;

    }
}
