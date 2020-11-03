package my.repository;

import my.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookRepository  {
    List<Book> findAll();
    Book findById(Long id);
    void save(Book book);
}
