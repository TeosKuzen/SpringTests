package pro.chef.dao.service;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.chef.dao.entity.OrdersEntity;
import pro.chef.dao.repository.OrdersRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Slf4j
@Service
public class OrdersService {

    private OrdersRepository repository;

    @Autowired
    public OrdersService(OrdersRepository repository) {
        this.repository = repository;
    }

    public List<OrdersEntity> findAllById(UUID id) {

        log.debug("Getting order for (id={}) from the DB", id);

        List<OrdersEntity> ordersEntities = repository.findAllById(id);

        if (!ordersEntities.isEmpty()) {
            log.info("Order for (id={}) has been successfully got from the DB", id);
        } else {
            log.info("Order for (id={}) has not been found in the DB", id);
        }

        return ordersEntities;
    }

    @SneakyThrows
    public Optional<OrdersEntity> findOptionalById(UUID id) {
        log.debug("Getting order (id={}) from the DB", id);

        Optional<OrdersEntity> orderEntityOptional = repository.findOptionalById(id);

        if (orderEntityOptional.isPresent()) {
            log.info("Order for (id={}) has been successfully found in the DB", id);
        } else {
            log.info("Order for (id={}) has not been found in the DB", id);
        }

        return orderEntityOptional;
    }

}
