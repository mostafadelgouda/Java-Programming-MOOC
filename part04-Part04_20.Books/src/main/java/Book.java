public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public void printAll() {
        // To Kill a Mockingbird, 281 pages, 1960
        System.out.println(this.title + ", " + this.pages + " pages" + ", " + this.publicationYear);

    }

    public void printTitle() {
        System.out.println(title);
    }
}
