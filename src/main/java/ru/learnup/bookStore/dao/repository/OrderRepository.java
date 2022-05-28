package ru.learnup.bookStore.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnup.bookStore.dao.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
