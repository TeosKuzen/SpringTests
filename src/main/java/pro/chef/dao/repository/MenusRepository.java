package pro.chef.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.chef.dao.entity.MenusEntity;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface MenusRepository extends JpaRepository<MenusEntity, Long> {

    List<MenusEntity> findAllById(UUID id);

    Optional<MenusEntity> findOptionalById(UUID id);

}
