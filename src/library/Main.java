package library;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("M");
        }).filter(book -> {
            return book.getBookTitle().startsWith("W");
        }).forEach(System.out::println);
    } // end of Main

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Masashi Kishimoto", "Naruto"));
        books.add(new Book("Tess Gerritsen", "Sinner"));
        books.add(new Book("Mokoto Shinkai", "Your Name"));
        books.add(new Book("Mokoto Shinkai", "Weathering with You"));
        books.add(new Book("Mokoto Shinkai", "The Garden of Words"));
        return books;
    };

}
