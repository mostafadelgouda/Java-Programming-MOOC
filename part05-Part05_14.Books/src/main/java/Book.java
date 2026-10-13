
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // @Override
    public boolean equals(Book b) {
        if (!(b instanceof Book))
            return false;
        Book otherBook = (Book) b;
        if (this.name.equals(otherBook.name) && this.publicationYear == otherBook.publicationYear)
            return true;
        return false;
    }

}
