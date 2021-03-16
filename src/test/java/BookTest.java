import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Dracula", "Bram Stoker", "Horror");
    }


    @Test
    public void bookHasTitle(){
        assertEquals("Dracula", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Bram Stoker", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Horror", book.getGenre());
    }

}
