package pro.chef.dao.service;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.chef.dao.entity.MenusEntity;
import pro.chef.dao.repository.MenusRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoArgsConstructor
@Slf4j
@Service
public class MenusService {

    private MenusRepository repository;

    @Autowired
    public MenusService(MenusRepository repository) {
        this.repository = repository;
    }

    public List<MenusEntity> findAllById(UUID id) {

        log.debug("Getting menu for (id={}) from the DB", id);

        List<MenusEntity> menusEntities = repository.findAllById(id);

        if (!menusEntities.isEmpty()) {
            log.info("Menu for (id={}) has been successfully got from the DB", id);
        } else {
            log.info("Menu for (id={}) has not been found in the DB", id);
        }

        return menusEntities;
    }

    @SneakyThrows
    public Optional<MenusEntity> findOptionalById(UUID id) {
        log.debug("Getting menu (id={}) from the DB", id);
        Optional<MenusEntity> menusEntityEntitiesOptional = repository.findOptionalById(id);

        if (menusEntityEntitiesOptional.isPresent()) {
            log.info("Menu for (id={}) has been successfully found in the DB", id);
        } else {
            log.info("Menu for (id={}) has not been found in the DB", id);
        }

        return menusEntityEntitiesOptional;
    }

}
