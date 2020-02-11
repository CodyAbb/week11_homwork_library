import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Lanark", "Alasdair Gray", "Postmodernism");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Lanark", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Alasdair Gray", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Postmodernism", book.getGenre());
    }
}
