import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Dracula", "Bram Stoker", "Horror");
    }


    @Test
    public void canAddBookToCollection(){
        library.addBook(book);
        assertEquals(1, library.getTotalBooks());
    }


    @Test
    public void canGetTotalBooks(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getTotalBooks());
    }


    @Test
    public void addsBookIfHasCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getTotalBooks());
    }

    @Test
    public void doesNotAddBookIfNoCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getTotalBooks());
    }

}
