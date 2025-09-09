package aiTraning;

public class Book {

    private String title;
    private String author;
    private String isbn;

    Book(String title, String author, String isbn) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public String getTitle() {

        return this.title;
    }

    public String getAuthor() {

        return this.author;
    }

    public String getIsbn() {

        return this.isbn;
    }

    public String displayBookInfo() {

        return this.title + " " + this.author + " " + this.isbn;
    }

    public static void main(String[] args) {

        Book book1 = new Book("Um velho velhaco e seu neto bundao", "nao sei", "duzentos");

        Book book2 = new Book("A insonia do vampiro", "nao sei", "trezentos");
        System.out.println(book1.displayBookInfo());
        System.out.println(book2.displayBookInfo());

    }
}
