import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;

    public BookShelf(int maxSize) {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return this.books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
