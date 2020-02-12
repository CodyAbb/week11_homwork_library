import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("Lanark", "Alasdair Gray", "Postmodernism");
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void cannotAddBookAsOverCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.numberOfBooks());
    }

    @Test
    public void canLoanBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.loanBook();
        assertEquals(2, library.numberOfBooks());
    }

    @Test
    public void canAddGenreCount(){
        library.addToGenreCount(book);
        library.addToGenreCount(book);
        assertEquals(2, library.getGenreCount("Postmodernism"));
    }

}
