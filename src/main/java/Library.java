import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
        this.genreCount = new HashMap<String, Integer>();
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

    public void addToGenreCount(Book book) {
        if (this.genreCount.containsKey(book.getGenre())) {
            this.genreCount.put(book.getGenre(), genreCount.get(book.getGenre()) + 1);
        } else {
            genreCount.put(book.getGenre(), 1);
        }
    }

    public int getGenreCount(String genre){
        return this.genreCount.get(genre);
    }
}
