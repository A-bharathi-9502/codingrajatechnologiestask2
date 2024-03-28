public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;

    // Constructors, getters, setters, toString()
}

public class Patron {
    private int id;
    private String name;
    private String contactInfo;

    // Constructors, getters, setters, toString()
}

public class BorrowingRecord {
    private Book book;
    private Patron patron;
    private Date borrowingDate;
    private Date returnDate;

    // Constructors, getters, setters, toString()
}

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;
    private List<BorrowingRecord> borrowingRecords;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.borrowingRecords = new ArrayList<>();
    }

    // Methods to add/remove books, patrons, issue/return books, generate reports, etc.
}

public class Main {
    public static void main(String[] args) {
        // Testing the library management system
        Library library = new Library();
        
        // Add books and patrons
        library.addBook(new Book("123456789", "Sample Book", "John Doe", "Fiction"));
        library.addPatron(new Patron(1, "Alice", "alice@example.com"));

        // Issue and return books
        library.issueBook("123456789", 1);
        library.returnBook("123456789", 1);

        // Generate report
        library.generateReport();
    }
}
