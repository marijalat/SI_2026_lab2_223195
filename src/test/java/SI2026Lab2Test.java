import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SI2026Lab2Test {

    Library library;

    public SI2026Lab2Test() {
        library = new Library();
        library.addBook(new Book("Clean Code", "Robert Martin", "Programming"));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "Programming"));
        library.addBook(new Book("The Hobbit", "Tolkien", "Fantasy"));
    }

    @Test
    public void testSearchBookFound() {
        assertNotNull(library.searchBookByTitle("Clean Code"));
    }

    @Test
    public void testSearchBookNotFound() {
        assertNull(library.searchBookByTitle("Unknown"));
    }

    @Test
    public void testSearchBookEmptyTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            library.searchBookByTitle("");
        });
    }


    @Test
    public void testBorrowBookSuccess() {
        Library lib = new Library();
        Book b = new Book("Clean Code", "Robert Martin", "Programming");
        lib.addBook(b);

        lib.borrowBook("Clean Code", "Robert Martin");

        assertTrue(b.isBorrowed());
    }

    @Test
    public void testBorrowBookInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            library.borrowBook("", "Author");
        });
    }

    @Test
    public void testBorrowBookAlreadyBorrowed() {
        Library lib = new Library();
        Book b = new Book("Clean Code", "Robert Martin", "Programming");
        lib.addBook(b);

        lib.borrowBook("Clean Code", "Robert Martin");

        assertThrows(RuntimeException.class, () -> {
            lib.borrowBook("Clean Code", "Robert Martin");
        });
    }

    @Test
    public void testBorrowBookNotFound() {
        assertThrows(RuntimeException.class, () -> {
            library.borrowBook("DoesNotExist", "Nobody");
        });
    }


    @Test
    public void testMultipleConditionBorrowBook() {


        assertThrows(IllegalArgumentException.class, () -> {
            library.borrowBook("", "");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            library.borrowBook("", "Author");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            library.borrowBook("Clean Code", "");
        });

        assertThrows(RuntimeException.class, () -> {
            library.borrowBook("Unknown", "Unknown");
        });
    }
}