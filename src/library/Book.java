package library;

public class Book {
    private String author;
    private String bookTitle;

    public Book(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return this.author;
    }


    public String getBookTitle() {
        return this.bookTitle;
    }

    @Override
    public String toString() {
        return "Author " + this.author + " Book title: " + this.bookTitle;
    }
}
