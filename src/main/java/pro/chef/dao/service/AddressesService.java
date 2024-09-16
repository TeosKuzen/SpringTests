package pro.chef.dao.service;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.chef.dao.entity.AddressesEntity;
import pro.chef.dao.repository.AddressesRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Классы с логикой {@link Service} содержат бизнес-логику по обработке данных, полученных из БД(автотесты и т.п.)
 * Ниже представлены классы с похожей логикой
 * {@link BasketsService}
 * {@link ClientsService}
 * {@link MenusService}
 * {@link OrdersService}
 * */
@NoArgsConstructor
@Slf4j
@Service
public class AddressesService {

    private AddressesRepository repository;

    @Autowired
    public AddressesService(AddressesRepository repository) {
        this.repository = repository;
    }

    public List<AddressesEntity> findAllById(UUID id) {

        log.debug("Getting address for (id={}) from the DB", id);

        List<AddressesEntity> addressesEntities = repository.findAllById(id);

        if (!addressesEntities.isEmpty()) {
            log.info("Address for (id={}) has been successfully got from the DB", id);
        } else {
            log.info("Address for (id={}) has not been found in the DB", id);
        }

        return addressesEntities;
    }

    @SneakyThrows
    public Optional<AddressesEntity> findOptionalById(UUID id) {
        log.debug("Getting Address (id={}) from the DB", id);
        Optional<AddressesEntity> addressesEntitiesOptional = repository.findOptionalById(id);

        if (addressesEntitiesOptional.isPresent()) {
            log.info("Address for (id={}) has been successfully found in the DB", id);
        } else {
            log.info("Address for (id={}) has not been found in the DB", id);
        }

        return addressesEntitiesOptional;
    }

}
