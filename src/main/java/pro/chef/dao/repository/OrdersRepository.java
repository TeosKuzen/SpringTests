package pro.chef.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.chef.dao.entity.OrdersEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Репозиторий для таблицы Orders
 */
@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity, Long> {

    List<OrdersEntity> findAllById(UUID id);

    Optional<OrdersEntity> findOptionalById(UUID id);

}