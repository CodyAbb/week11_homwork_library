import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        library = new Library(5);
        borrower = new Borrower();
        book = new Book("Lanark", "Alasdair Gray", "Postmodernism");
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void canAddBookFromLibraryToCollection(){
        borrower.addLoanToCollection(library);
        assertEquals(1, borrower.numberOfBooksInCollection());
    }
}
