package pro.chef.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.chef.dao.entity.BasketsEntity;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BasketsRepository extends JpaRepository<BasketsEntity, Long> {

    List<BasketsEntity> findAllById(UUID id);

    Optional<BasketsEntity> findOptionalById(UUID id);

}
