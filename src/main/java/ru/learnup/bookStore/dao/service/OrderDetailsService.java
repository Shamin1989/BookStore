package ru.learnup.bookStore.dao.service;
import org.springframework.stereotype.Service;
import ru.learnup.bookStore.dao.entity.OrderDetails;
import ru.learnup.bookStore.dao.repository.OrderDetailsRepository;
import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailsService {

    private final OrderDetailsRepository orderDetailRepository;

    public OrderDetailsService(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailRepository = orderDetailsRepository;
    }
    public List<OrderDetails> getOrderDetail() {
        return orderDetailRepository.findAll();
    }

    public OrderDetails getOrderDetailById(long id) {
        return orderDetailRepository.getById(id);
    }

    public Optional<OrderDetails> findOrderDetailById (long id) {
        return orderDetailRepository.findById(id);
    }
}
