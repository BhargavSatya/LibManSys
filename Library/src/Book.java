
public class Book {

    private final String title, author;
    private final int id;

    public Book(int id, String title, String author) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "      " + title + "      " + author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

}
