package pro.chef.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.chef.dao.entity.AddressesEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Класс, помеченный {@link Repository} отвечает за доступ и обработку данных в БД
 * В данном классе используется класс JpaRepository для обработки предполагаемой таблицы
 * Ниже представлены классы с похожей логикой
 * {@link BasketsRepository}
 * {@link ClientsRepository}
 * {@link MenusRepository}
 * {@link OrdersRepository}
 */
@Repository
public interface AddressesRepository extends JpaRepository<AddressesEntity, Long> {

    List<AddressesEntity> findAllById(UUID id);

    Optional<AddressesEntity> findOptionalById(UUID id);

}