package pro.chef.dao.entity;

import java.time.ZonedDateTime;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * {@link Entity} Обозначает класс, как сущность таблицы БД
 * Ниже представлена модель данных для сериализации объекта SQL:address в Java-объект
 * Нижеуказанные классы собраны похожим образом
 * {@link BasketsEntity}
 * {@link ClientsEntity}
 * {@link MenusEntity}
 * {@link OrdersEntity}
 * Это позволяет нам быстро получать значения полей SQL для проверок в автотестах Java
 * */
@Data
@Entity
//@Table(schema = "public", name = "orders")
@Table(name = "addresses")
public class AddressesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    /** Номер заказа */
    @Column(name = "chef_id", nullable = false)
    private Integer chefId;

    @Column(name = "client_id", nullable = false)
    private String clientId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "client_name", nullable = false)
    private String clientName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "apartment", nullable = false)
    private String apartment;

    @Column(name = "address_str", nullable = false)
    private String addressStr;

    @Column(name = "dadata", nullable = false)
    private String daData;

    @Column(name = "comment", nullable = false)
    private String comment;

    @Column(name = "default", nullable = false)
    private Boolean default_;

    @Column(name = "sort", nullable = false)
    private Integer sort;

    @Column(name = "lat", nullable = false)
    private Double lat;

    @Column(name = "lon", nullable = false)
    private Double lon;

    @Column(name = "created_at", nullable = false)
    private ZonedDateTime created_at;

    @Column(name = "updated_at", nullable = false)
    private ZonedDateTime updatedAt;

    @Column(name = "deleted_at")
    private ZonedDateTime deletedAt;

    @Column(name = "is_pickup", nullable = false)
    private Boolean isPickup;

    @Column(name = "entrance", nullable = false)
    private String entrance;

    @Column(name = "floor", nullable = false)
    private String floor;

    @Column(name = "intercom", nullable = false)
    private String intercom;

    @Column(name = "chef_zone_id", nullable = false)
    private Integer chefZoneId;

    @Column(name = "is_validated", nullable = false)
    private Boolean isValidated;

    @Column(name = "chef_region_id", nullable = false)
    private Integer chefRegionId;

}
