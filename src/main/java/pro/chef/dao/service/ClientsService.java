package pro.chef.dao.service;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.chef.dao.entity.ClientsEntity;
import pro.chef.dao.repository.ClientsRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Slf4j
@Service
public class ClientsService {

    private ClientsRepository repository;

    @Autowired
    public ClientsService(ClientsRepository repository) {
        this.repository = repository;
    }

    public List<ClientsEntity> findAllById(UUID id) {

        log.debug("Getting client for (id={}) from the DB", id);

        List<ClientsEntity> clientsEntities = repository.findAllById(id);

        if (!clientsEntities.isEmpty()) {
            log.info("Client for (id={}) has been successfully got from the DB", id);
        } else {
            log.info("Client for (id={}) has not been found in the DB", id);
        }

        return clientsEntities;
    }

    @SneakyThrows
    public Optional<ClientsEntity> findOptionalById(UUID id) {
        log.debug("Getting basket (id={}) from the DB", id);
        Optional<ClientsEntity> clientsEntityEntitiesOptional = repository.findOptionalById(id);

        if (clientsEntityEntitiesOptional.isPresent()) {
            log.info("Client for (id={}) has been successfully found in the DB", id);
        } else {
            log.info("Client for (id={}) has not been found in the DB", id);
        }

        return clientsEntityEntitiesOptional;
    }

}
