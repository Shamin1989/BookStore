package ru.learnup.bookStore.dao.service;
import org.springframework.stereotype.Service;
import ru.learnup.bookStore.dao.entity.Author;
import ru.learnup.bookStore.dao.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
    public Author getAuthorById(Long id) {
        return authorRepository.getById(id);
    }

}
