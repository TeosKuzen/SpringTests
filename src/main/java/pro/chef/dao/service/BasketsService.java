package pro.chef.dao.service;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.chef.dao.entity.AddressesEntity;
import pro.chef.dao.entity.BasketsEntity;
import pro.chef.dao.repository.AddressesRepository;
import pro.chef.dao.repository.BasketsRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Slf4j
@Service
public class BasketsService {

    private BasketsRepository repository;

    @Autowired
    public BasketsService(BasketsRepository repository) {
        this.repository = repository;
    }

    public List<BasketsEntity> findAllById(UUID id) {

        log.debug("Getting basket for (id={}) from the DB", id);

        List<BasketsEntity> basketsEntities = repository.findAllById(id);

        if (!basketsEntities.isEmpty()) {
            log.info("Basket for (id={}) has been successfully got from the DB", id);
        } else {
            log.info("Basket for (id={}) has not been found in the DB", id);
        }

        return basketsEntities;
    }

    @SneakyThrows
    public Optional<BasketsEntity> findOptionalById(UUID id) {
        log.debug("Getting basket (id={}) from the DB", id);
        Optional<BasketsEntity> basketsEntitiesOptional = repository.findOptionalById(id);

        if (basketsEntitiesOptional.isPresent()) {
            log.info("Basket for (id={}) has been successfully found in the DB", id);
        } else {
            log.info("Basket for (id={}) has not been found in the DB", id);
        }

        return basketsEntitiesOptional;
    }

}
