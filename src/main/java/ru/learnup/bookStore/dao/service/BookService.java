package ru.learnup.bookStore.dao.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.learnup.bookStore.BookStoreApplication;
import ru.learnup.bookStore.dao.entity.Book;
import ru.learnup.bookStore.dao.repository.BookRepository;
import java.util.List;


@Service
public class BookService {

    private static final Logger log = LoggerFactory.getLogger(BookStoreApplication.class);

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(long id) {
        return bookRepository.getById(id);
    }
}