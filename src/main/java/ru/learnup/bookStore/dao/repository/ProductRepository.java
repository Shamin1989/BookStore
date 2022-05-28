package ru.learnup.bookStore.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.learnup.bookStore.dao.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from product p where p.id = :id",
            nativeQuery = true)
    Product findProductById(Long id);
}
