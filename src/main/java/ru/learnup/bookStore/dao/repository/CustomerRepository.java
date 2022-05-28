package ru.learnup.bookStore.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.bookStore.dao.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
