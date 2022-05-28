package ru.learnup.bookStore.dao.service;
import org.springframework.stereotype.Service;
import ru.learnup.bookStore.dao.entity.Warehouse;
import ru.learnup.bookStore.dao.repository.WarehouseRepository;
import java.util.List;

@Service
public class WarehouseService {

    private final WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }
    public List<Warehouse> getWarehouse() {
        return warehouseRepository.findAll();
    }
    public Warehouse addWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }
    public Warehouse getWarehouseById(long id) {
        return warehouseRepository.getById(id);
    }

}
