package hw4.src.book;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}