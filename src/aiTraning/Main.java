package aiTraning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        int i = 0;
        boolean loop = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Library\n");

        while (loop) {

            System.out.println("1. Add new book");
            System.out.println("2. List all books");
            System.out.println("3. Find a book by title");
            System.out.println("4. Exit");
            i = scan.nextInt();
            scan.nextLine(); //consume the leftover newline

            switch (i) {

                case 1:
                    System.out.print("Enter the book's name: ");
                    String bookname = scan.nextLine();
                    System.out.print("Enter the book's author: ");
                    String bookauthor = scan.nextLine();
                    System.out.print("Enter the book's ISBN: ");
                    String bookisbn = scan.next();

                    library.addBook(bookname, bookauthor, bookisbn);

                    break;
                case 2:
                    System.out.println("this is the list of all books in your library: ");
                    library.listBooks();
                    break;
                case 3:
                    System.out.print("Enter the name of the book you want to find: ");
                    String fbook = scan.nextLine();
                    Book book = library.findBookByTitle(fbook);

                    if (book != null) {
                        System.out.println("The book is: " + book.toString());
                    } else {
                        System.out.println("Sorry, the book wasn't found");
                    }

                    break;
                case 4:
                    System.out.println("Goodbye");
                    scan.close();
                    loop = false;
                    break;
            }

        }

    }
}
