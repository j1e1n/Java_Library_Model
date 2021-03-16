import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity) {
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public void addBook(Book book) {
        if(hasCapacity()){
            this.bookCollection.add(book);
        }
    }

    public int getTotalBooks() {
        return this.bookCollection.size();
    }

    public boolean hasCapacity(){
        if(this.getTotalBooks() < this.capacity){
            return true;
        }
        return false;
    }
}
