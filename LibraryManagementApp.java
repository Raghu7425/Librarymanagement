import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}

public class LibraryManagementApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Get user inputs to add books
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for Book " + i + ":");
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            Book book = new Book(isbn, title, author);
            library.addBook(book);
        }

        // Display all books in the library
        List<Book> allBooks = library.getAllBooks();
        System.out.println("\nAll Books in the Library:");
        for (Book book : allBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
