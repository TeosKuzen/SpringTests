package pro.chef.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.chef.dao.entity.ClientsEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientsRepository extends JpaRepository<ClientsEntity, Long> {

    List<ClientsEntity> findAllById(UUID id);

    Optional<ClientsEntity> findOptionalById(UUID id);

}
