package my.service;

import my.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    void save(Book book);
}
