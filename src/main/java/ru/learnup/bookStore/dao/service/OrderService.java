package ru.learnup.bookStore.dao.service;
import org.springframework.stereotype.Service;
import ru.learnup.bookStore.dao.entity.Order;
import ru.learnup.bookStore.dao.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrderById(long id) {
        return orderRepository.getById(id);
    }
}
