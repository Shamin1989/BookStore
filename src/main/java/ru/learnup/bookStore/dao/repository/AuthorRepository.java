package ru.learnup.bookStore.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.learnup.bookStore.dao.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
