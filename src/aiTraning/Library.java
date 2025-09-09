package aiTraning;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    Library(Book book) {
        books.add(book);
    }

    Library() {
        //Defalt counstructor
    }

    public void addBook(Book book) {

        books.add(book);

    }

    public void addBook(String title, String author, String isbn) {

        Book newBook = new Book(title, author, isbn);
        this.books.add(newBook);
    }

    public void listBooks() {
        for (Book book : books) {

            System.out.println(book.toString());
        }

    }

    public Book findBookByTitle(String title) {

        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;

            }

        }
        return null;
    }

}