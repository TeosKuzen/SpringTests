package pro.chef.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@Entity
//@Table(schema = "public", name = "menus")
@Table(name = "menus")

public class MenusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "replace_for")
    private UUID replaceFor;

    @Column(name = "available")
    private boolean available;

    @Column(name = "days")
    private Integer days;

    @Column(name = "type_id")
    private UUID typeId;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

}
