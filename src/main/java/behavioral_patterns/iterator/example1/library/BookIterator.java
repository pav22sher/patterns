package behavioral_patterns.iterator.example1.library;

public class BookIterator {
    private final Library library;
    private int index = 0;
    public BookIterator(Library library) {
        this.library = library;
    }
    public boolean hasNext() {
        return index < library.getBookCount();
    }
    public Book next() {
        return library.getBook(index++);
    }
}
