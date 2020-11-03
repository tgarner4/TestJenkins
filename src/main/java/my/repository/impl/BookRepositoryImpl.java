package my.repository.impl;

import my.model.Book;
import my.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private static Map<Long, Book> bookStore = new ConcurrentHashMap<>();
    private final static AtomicLong lastId = new AtomicLong(0L);

    @Override
    public List<Book> findAll() {
        return new ArrayList(bookStore.values());
    }

    @Override
    public Book findById(Long id) {
        return bookStore.get(id);
    }

    @Override
    public void save(Book book) {
        bookStore.put(lastId.incrementAndGet(), book);
    }
}
