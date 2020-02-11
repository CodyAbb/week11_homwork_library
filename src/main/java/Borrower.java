import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int numberOfBooksInCollection(){
        return this.collection.size();
    }

    public void addLoanToCollection(Library library){
        Book book = library.loanBook();
        this.collection.add(book);
    }
}
