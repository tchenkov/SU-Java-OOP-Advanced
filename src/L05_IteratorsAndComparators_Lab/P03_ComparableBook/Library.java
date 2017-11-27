package L05_IteratorsAndComparators_Lab.P03_ComparableBook;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;
    
    public Library(Book... books) {
        this.books = books;
    }
    
    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }
    
    private final class LibIterator implements Iterator<Book>{
        int index = 0;
    
        private LibIterator() {
        }
    
        @Override
        public boolean hasNext() {
            return this.index < books.length;
        }
    
        @Override
        public Book next() {
            return books[index++];
        }
    }
}
