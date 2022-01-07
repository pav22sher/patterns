package behavioral_patterns.iterator.example1;

import behavioral_patterns.iterator.example1.library.Book;
import behavioral_patterns.iterator.example1.library.BookIterator;
import behavioral_patterns.iterator.example1.library.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Война и мир"));
        library.addBook(new Book("Отцы и дети"));
        library.addBook(new Book("Вишневый сад"));
        BookIterator iterator = library.iterator();
        while(iterator.hasNext())
        {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
