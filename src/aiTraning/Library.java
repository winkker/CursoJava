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

    public static void main(String[] args) {
        Book book1 = new Book("Um velho velhaco e seu neto bundao", "nao sei", "duzentos");

        Library library = new Library(book1);

        Book book;
        library.addBook(book = new Book("A insonia do vampiro", "nao sei", "trezentos"));

        library.listBooks();
        Book booktofind = library.findBookByTitle("A insonia do vampiro");

        if (booktofind != null) {
            System.out.println("Book found: " + booktofind.toString());

        } else {
            System.out.println("Book not found");
        }

    }
}