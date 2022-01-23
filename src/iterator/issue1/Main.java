
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book A"));
        bookShelf.appendBook(new Book("book B"));
        bookShelf.appendBook(new Book("book C"));
        bookShelf.appendBook(new Book("book D"));
        Iterator it = new BookShelfIterator(bookShelf);
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
