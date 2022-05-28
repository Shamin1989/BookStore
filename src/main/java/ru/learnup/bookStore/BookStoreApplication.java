package ru.learnup.bookStore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.bookStore.dao.entity.Book;
import ru.learnup.bookStore.dao.repository.BookRepository;
import ru.learnup.bookStore.dao.service.BookService;

@SpringBootApplication
public class BookStoreApplication {

    private static final Logger log = LoggerFactory.getLogger(BookStoreApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BookStoreApplication.class, args);

        BookRepository bookRepository = context.getBean(BookRepository.class);
        log.info("Search result: {}", bookRepository.findByAuthor("Толстой Лев Николаевич"));




    }

}
