import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int numberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.books.size() < this.capacity){
            this.books.add(book);
        }
    }

    public Book loanBook(){
        if (this.books.size() > 0){
            return this.books.remove(0);
        } else {
            return null;
        }
    }
}
