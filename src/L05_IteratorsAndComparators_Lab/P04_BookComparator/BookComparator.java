package L05_IteratorsAndComparators_Lab.P04_BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getTitle().equals(book2.getTitle())){
            return book1.getYear().compareTo(book2.getYear());
        }
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
