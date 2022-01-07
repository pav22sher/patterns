package behavioral_patterns.iterator.example1.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public Book getBook(int index){
        return books.get(index);
    }
    public int getBookCount(){
        return books.size();
    }
    public BookIterator iterator(){
        return new BookIterator(this);
    }
}
